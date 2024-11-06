import users from "../Database/Users.js";
var passinput = document.querySelector("#pass");
var loginbtn = document.querySelector('#loginbtn');
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

const checkDetails = (fname,email,pass) =>{
    if(!fname || !email || !pass){
        return false;
    }
    
    let flag = false;
    Array.from(users).forEach((user)=>{
        console.log(user.fname, user.email, user.pass);
        if(String(user.fname).trim() == fname && String(user.email).trim() == email && String(user.pass).trim() == pass){
            flag = true;
        }
    })
    return flag;
}

loginbtn.addEventListener('click',(e)=>{
    e.preventDefault();
        let fname = String(document.querySelector('#fname').value).trim();
        let email = String(document.querySelector('#email').value).trim();
        let pass = String(document.querySelector('#pass').value).trim();
        let flag = checkDetails(fname,email,pass);
        console.log(flag)
        if(!flag){
            alert("Invalid Inputs!!")
            return;
        }
        let userObj = {
            fname,email,pass
        }
        localStorage.setItem("user",JSON.stringify(userObj));
        window.location.href = "http://127.0.0.1:5500/Main/index.html";
})
