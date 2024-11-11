import express from "express";
import dotenv from "dotenv";
import cors from "cors";
import { establishConnection } from "./src/config/dbConnet.js";
import Router from "./src/Routes/Route.js";
dotenv.config();

const app = express();
const PORT = process.env.PORT;

//Middlewares 
app.use(cors());
app.use(express.json());

//Start Server
app.listen(PORT,()=>{
    console.log(`Server is running at port ${PORT}`);
    establishConnection();
})

//Routes
app.use("/",Router);