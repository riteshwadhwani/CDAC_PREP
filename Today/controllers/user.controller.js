import User from "../models/userSchema.js";
import lodash from "lodash";


export const createUser = async(req,res) =>{
    try {
        console.log(req.body);
        const {firstName, lastName,email, password} = req.body;
        const newUser = await new User({firstName,lastName,email,password});
        await newUser.save();
        res.status(201).json({
            message:"User is created!!"
        })
    } catch (error) {
        console.log(error);
        res.status(500).json({
            error:"Error Occured"
        })
    }
}


export const listUsers = async(req,res) =>{
    try {
        let allUsers =  await User.find();
        return res.status(200).json({
            allUsers,
        })
    } catch (error) {
        res.status(500).json({
            error:"Error on finding the users"
        })
    }
}

export const updateUser = async(req,res) =>{
    try {
        //fetch the email
        const {email} = req.body;
        console.log(req.body);
        // //get the userDetails
        let userDetails = await User.findOne({email});
        userDetails.firstName = req.body.firstName;
        lodash.extend(userDetails);
        userDetails.save();
        res.status(200).json({
            message:"Update User!!"
        })
    } catch (error) {
        console.log(error);
    }
}


// export default {createUser};