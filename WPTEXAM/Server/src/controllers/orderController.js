import { getConnection } from "../config/dbConnet.js";

const connection = getConnection();
export function createOrder(req,res){
try {
    const {email,orderitems,orderamount} = req.body;
    let fetchQuery = `Select * from user where email = '${email}'`;
    connection.query(fetchQuery,(error,result)=>{
        if(error){
            console.log(error);
            res.status(500).send({
                message:"Internal server error!!"
            })
        }
        else{
            if(result.length>0){
                let userDetails = result[0];
                const{uid} = userDetails;
                let insertQuery = `Insert into orders values
                (${uid},NULL,${orderitems},${orderamount})`
                connection.query(insertQuery,(error,result)=>{
                    if(error){
                        console.log(error)
                        res.status(500).send({
                            message:"Internal Server Error!!"
                        })
                    }
                    else{
                        res.status(201).send({
                            message:"Order Created Successfully"
                        })
                    }
                })
            }
        }
    })
} catch (error) {
    console.log(error)
    res.status(500).send({
        message:"Internal Server Error!! or in fetching data"
    })
}
}