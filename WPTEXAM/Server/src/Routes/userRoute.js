import express from "express";
import { createUser, getMyOrders, loginUser } from "../controllers/userController.js";
import { verifyToken } from "../middleware/verifyToken.js";

const userRouter = express.Router();

userRouter.post("/createUser",createUser);
userRouter.post("/loginUser",loginUser);
userRouter.get("/getMyOrders/:email",getMyOrders);

export default userRouter;