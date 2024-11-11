

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

    const  registerUser = async(fname,lname,email,password) =>{
        if(fname== "" || lname == "" || email =="" || password == ""){
            alert("Invalid Credentials");
            return false;
        }
        const response = await fetch("http://localhost:4000/user/createUser",{
            method: 'POST',
            headers:{
                "Content-Type": "application/json",
            },
            body: JSON.stringify({fname,lname,email,password})
            })
            const data = await response.json();
            console.log(data);
            if(data.success){
                let userObj = {
                    fname,lname,email,token:data.token
                }
                localStorage.setItem("user",JSON.stringify(userObj));
                return true; 
           }
           alert(data.message);
           return false;
    }

    signup.addEventListener('click',async (e)=>{
        e.preventDefault();
        let fname = String(document.querySelector('#fname').value).trim();
        let lname = String(document.querySelector('#lname').value).trim();
        let email = String(document.querySelector('#email').value).trim();
        let password = String(document.querySelector('#pass').value).trim();

        const fnameRegex = /^[A-Za-z]+$/;
        const lnameRegex = /^[A-Za-z]+$/;
        const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        if (!fnameRegex.test(fname)) {
            alert('First name should contain only letters.');
            return;
        }
        if (!lnameRegex.test(lname)) {
            alert('Last name should contain only letters.');
            return;
        }
        if (!emailRegex.test(email)) {
            alert('Please enter a valid email address.');
            return;
        }
        let flag = await registerUser(fname,lname,email,password);
        console.log(flag)
        if(!flag){
            return;
        }
        
        window.location.href = "http://127.0.0.1:5500/Main/index.html";
    })
