import { getConnection } from "../config/dbConnet.js";
import jwt from "jsonwebtoken"
import { configDotenv } from "dotenv";
configDotenv();

const secretKey = process.env.SECRET_KEY;
const connection = getConnection();

export function loginAdmin(req,res){
    try {
        const { fname, email, password } = req.body;
        let fetchQuery = `Select * from admin where email = '${email}'`;
        connection.query(fetchQuery,(error,result)=>{
            if(error){
                console.log(error)
                res.status(500).send({
                    messag:"Internal Server Error!!"
                })
            }
            else{
                if(result.length>0){
                    let adminDetails = result[0];
                if(adminDetails.password != password){
                    
                    res.status(401).send({
                        messag:"Password Incorrect!!",
                    })
                }
                else{
                    let token = jwt.sign({fname}, secretKey, {
                        expiresIn: 3 * 24 * 60 * 60 * 1000,
                      });
                    res.status(200).send({
                        success:true,
                        messag:"User LoggedIN",
                        token
                    })
                }
                }
                else{
                    res.status(401).send({
                        messag:"No admin present"
                    })
                }
            }
        })
      } catch (error) {
        console.log(error)
      }
}

export function getAllOrders(req,res){
    try {
        let insertQuery = `  select fname,orderid,orderitems,orderamount from orders, user where user.uid = orders.uid`;
        connection.query(insertQuery,(error,result)=>{
            if(error){
                console.log(error)
                res.status(500).send({
                    messag:"Internal Server Error!!"
                })
            }
            else{
                console.log(result);
                res.status(200).send({
                    data : result
                })
            }
        })
    } catch (error) {
        console.log(error)
        res.status(500).send({
            messag:"Internal Server Error!!"
        })
    }
} 


export function getUsers(req,res){
    try {
        let insertQuery = `Select fname from user order by fname limit 10`;
        connection.query(insertQuery,(error,result)=>{
            if(error){
                res.status(500).send({
                    messag:"Internal Server Error!!"
                })
            }
            else{
                res.status(200).send({
                    data : result
                })
            }
        })
    } catch (error) {
        res.status(500).send({
            messag:"Internal Server Error!!"
        })
    }
} 