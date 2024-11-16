import {createUser, listUsers, updateUser} from "../controllers/user.controller.js"
import e from "express"

const userRouter = e.Router();


userRouter.post("/createUser",createUser);
userRouter.get("/getAllusers",listUsers);
userRouter.put("/updateUser",updateUser)


export default userRouter;