import express from "express";
import { getAllOrders, getUsers, loginAdmin } from "../controllers/adminController.js";
import { isAdmin } from "../middleware/isAdmin.js";
import { verifyToken } from "../middleware/verifyToken.js";

const adminRouter = express.Router();
adminRouter.post("/adminlogin",loginAdmin);
adminRouter.get("/getUsers",isAdmin,getUsers);
adminRouter.get("/getOrders/:email",isAdmin,verifyToken, getAllOrders);

export default adminRouter;