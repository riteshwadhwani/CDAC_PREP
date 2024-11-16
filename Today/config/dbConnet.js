import mongoose from "mongoose";
import { config } from "dotenv";
config();
export const connect = () =>{
    mongoose.connect(process.env.Mongo_URL).then(()=>{
        console.log("DB connected Successfully!!")
    })
    .catch((error)=>{
        console.log(error);
    })
}