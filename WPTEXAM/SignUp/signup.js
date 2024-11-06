import users from "../Database/Users.js";

const signup = document.querySelector('#signupbtn');
var passinput = document.querySelector("#pass");

    const changeAttribute = (passinput)=>{
        passinput.removeAttribute("type");
        passinput.setAttribute("type","text");
    }
   
    passinput.addEventListener('keydown',()=>{
        changeAttribute(passinput);
        setTimeout(()=>{
            passinput.removeAttribute('type');
            passinput.setAttribute('type','password');
        },2500)
    })

    const checkDetails = (email) =>{
        let flag = false;
        Array.from(users).forEach((user)=>{
            console.log(user.email);
            if( String(user.email).trim() == email ){
                flag = true;
            }
        })
        return flag;
    }

    signup.addEventListener('click',(e)=>{
        e.preventDefault();
        let fname = String(document.querySelector('#fname').value).trim();
        let lname = String(document.querySelector('#lname').value).trim();
        let email = String(document.querySelector('#email').value).trim();
        let pass = String(document.querySelector('#pass').value).trim();
        console.log(fname,lname,email,pass);
        let flag = checkDetails(email);
        console.log(flag)
        if(flag){
            alert("Already Registered Please Login!!")
            return;
        }
        let userObj = {
            fname,lname,email,pass
        }
        users.push({fname:fname,lname:lname,email:email,pass:pass});
        console.log(users);
        localStorage.setItem("user",JSON.stringify(userObj));
        window.location.href = "http://127.0.0.1:5500/Main/index.html";
    })
