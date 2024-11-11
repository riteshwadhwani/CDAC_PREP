import users from "../Database/Users.js";
var passinput = document.querySelector("#pass");
var loginbtn = document.querySelector('#loginbtn');
var adminbtn = document.querySelector("#admin");
var isAdmin = false;
const changeAttribute = (passinput)=>{
    passinput.removeAttribute("type");
    passinput.setAttribute("type","text");
}

passinput.addEventListener('keydown',()=>{
    changeAttribute(passinput);
    setTimeout(()=>{
        passinput.removeAttribute('type');
        passinput.setAttribute('type','password');
    },3000)
})

const  loginUser = async(fname,email,password) =>{
    const response = await fetch("http://localhost:4000/user/loginUser",{
        method: 'POST',
        headers:{
            "Content-Type": "application/json",
        },
        body: JSON.stringify({fname,email,password})
        })
        const data = await response.json();
        if(data.success){
            let userObj = {
                fname,email,token:data.token
            }
            localStorage.setItem("user",JSON.stringify(userObj));
            return true; 
       }
       return false;
}
const adminLogin = async(fname,email,password)=>{
    console.log("clicked")
    const response = await fetch("http://localhost:4000/admin/adminlogin",{
        method: 'POST',
        headers:{
            "Content-Type": "application/json",
        },
        body: JSON.stringify({fname,email,password})
        })
        const data = await response.json();
        console.log(data);
        console.log(data.token)
        if(data.success){
            let userObj = {
                isAdmin,fname,email,token:data.token
            }
            localStorage.setItem("user",JSON.stringify(userObj));
            return true; 
       }
       return false;
}
loginbtn.addEventListener('click',async(e)=>{
    e.preventDefault();

    let fname = String(document.querySelector('#fname').value).trim();
        let email = String(document.querySelector('#email').value).trim();
        let password = String(document.querySelector('#pass').value).trim();
        const fnameRegex = /^[A-Za-z]+$/;
        const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        if (!fnameRegex.test(fname)) {
            alert('First name should contain only letters.');
            return;
        }
        if (!emailRegex.test(email)) {
            alert('Please enter a valid email address.');
            return;
        }
       if(isAdmin){
        let flag = await adminLogin(fname,email,password);
        if(!flag){
            alert("Invalid Inputs!!")
            return;
        }
        window.location.href = "http://127.0.0.1:5500/Main/index.html";
       }
       else{
        let flag = await loginUser(fname,email,password);
        if(!flag){
            alert("Invalid Inputs!!")
            return;
        }
        window.location.href = "http://127.0.0.1:5500/Main/index.html";
       }
})

adminbtn.addEventListener("click",(e)=>{
    isAdmin = isAdmin == true ? false :  true;
    adminbtn.classList = adminbtn.classList == "activ" ? "" : "activ";
    console.log(isAdmin);
})