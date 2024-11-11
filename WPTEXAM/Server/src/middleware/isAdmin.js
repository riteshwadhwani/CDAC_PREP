import { getConnection } from "../config/dbConnet.js";

const connection = getConnection();
export function isAdmin(req,res,next){
    try {
        const{email} = req.params;
        let fetchQuery = `Select * from admin where email = '${email}'`
        connection.query(fetchQuery,(error,result)=>{
            if(error){
                console.log(error);
                res.status(500).send({
                    message:"Internal server error!!"
                })
            }
            else{
                if(result.length>0){
                    next();
                }
                else{
                    res.status(401).send({
                        message:"Not an admin!!"
                    })
                }
            }
        })
    } catch (error) {
        res.status(500).send({
            message:"Internal server error!!"
        })
    }
}