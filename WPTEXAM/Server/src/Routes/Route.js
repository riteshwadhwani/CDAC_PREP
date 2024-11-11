import express from "express";
import userRoute from "./userRoute.js";
import orderRouter from "./orderRoute.js";
import adminRouter from "./adminRoute.js";

const Router = express.Router();

Router.use("/user",userRoute);
Router.use("/order",orderRouter);
Router.use("/admin",adminRouter)

export default Router;