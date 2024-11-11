import { hashSync, compareSync } from "bcrypt";
import { getConnection } from "../config/dbConnet.js";
import jwt from "jsonwebtoken";
import { configDotenv } from "dotenv";
configDotenv();

const connection = getConnection();
const secretKey = process.env.SECRET_KEY;
console.log(secretKey)
function isPresent(email) {
  return new Promise((resolve, reject) => {
    let fetchQuery = `Select * from user where email = '${email}'`;
    connection.query(fetchQuery, (error, result) => {
      if (error) {
        resolve(true);
      } else {
        console.log(result);
        if (result.length >0) {
          resolve(true);
        } else {
          resolve(false);
        }
      }
    });
  });
}
export async function createUser(req, res) {
  try {
    const { fname, lname, email, password } = req.body;
    const Present = await isPresent(email);
    if (Present) {
      res.json({
        success: false,
        status: 401,
        message: "User is already LoggedIn!!",
      });
    } else {
      const encryptedPassword = hashSync(password, 12);
      const insertQuery = `insert into user values
        ('${fname}','${lname}','${email}','${encryptedPassword}',NULL)`;
      const token = jwt.sign({fname}, secretKey, {
        expiresIn: 3 * 24 * 60 * 60 * 1000,
      });
      connection.query(insertQuery, (error, result) => {
        if (error) {
          res.json({
            success: false,
            status: 500,
            message: "Internal Server Error!!",
          });
        } else {
          res.json({
            success: true,
            status: 201,
            message: "User created Successfully!!",
            token,
          });
        }
      });
    }
  } catch (error) {
    console.log(error);
    res.json({
      success: false,
      status: 500,
      message: "Internal Server Error!!",
    });
  }
}

export function loginUser(req, res) {
  try {
    const { fname, email, password } = req.body;
    console.log(req.body);
    const fetchQuery = `select * from user where email = '${email}' and fname='${fname}'`;
    connection.query(fetchQuery, (error, result) => {
      if (error) {
        res.json({
          success: false,
          status: 500,
          message: "Internal Server Error!!",
        });
      } else {
        if (result.length > 0) {
          let userDetails = result[0];
          console.log(userDetails)
          const { fname} = userDetails;
          if (compareSync(password, userDetails.password)) {
            jwt.sign({fname}, secretKey, {expiresIn: 3 * 24 * 60 * 60 * 1000,}, (error, token) => {
              if (error) {
                console.log(error);
                res.status(500).send({
                  success: false,
                  message: "Jwt Internal Error",
                });
              } else {
                res.status(200).json({
                  success: true,
                  message: "Logged In successfully!!",
                  token,
                });
              }
            });
          } else {
            res.status(400).send({
              message: "Invalid Password",
            });
          }
        } else {
          res.status(400).send({
            message: "Invalid UserName!!",
          });
        }
      }
    });
  } catch (error) {
    res.status(500).send({
      message: "Internal Server Error",
    });
  }
}

export function getMyOrders(req,res){
  try {
    const{email} = req.params;
    let fetchQuery = `Select * from user where email = '${email}'`
    connection.query(fetchQuery,(error,result)=>{
      if(error){
        res.json({
          success: false,
          status: 500,
          message: "Internal Server Error!!",
        });
      }
      else{
        if(result.length>0){
          let userDetails = result[0];
          const{uid} = userDetails;
          let fetchQuery = `select * from orders where uid = ${uid}`;
          connection.query(fetchQuery,(error,result)=>{
            if(error){
              res.json({
                success: false,
                status: 500,
                message: "Internal Server Error!!",
              });
            }
            else{
              res.status(200).send({
                success :true,
                data:result
              })
            }
          })
        }
        else{
          res.json({
            success: false,
            status: 401,
            message: "No user Available!!",
          });
        }
      }
    })
  } catch (error) {
    
  }
}