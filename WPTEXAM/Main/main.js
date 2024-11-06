import users from "../Database/Users.js";
console.log(users)
let cartItems = JSON.parse(localStorage.getItem("cartItems"))||[];
localStorage.setItem("users",JSON.stringify(users));
localStorage.setItem("cartItems",JSON.stringify(cartItems));
var loginHandler = document.querySelector("#log-sign");
var h1 = document.querySelector('#nameHeading');
var logbtn = document.querySelector('#logout-btn');

var buttons = loginHandler.getElementsByTagName('button');
    var userInfo = JSON.parse(localStorage.getItem("user"));
    if(userInfo){
        
        Array.from(buttons).forEach((a)=>{
            a.classList = "visually-hidden"
        })
        h1.textContent = `Hi ${userInfo.fname}!!`
        h1.style.fontSize ="30px"
        h1.style.color = "#001f3f" 
        h1.classList = ""
        
        logbtn.classList = "logout-btn"
    }

var logout = document.querySelector("#logout-btn");
logout.addEventListener('click',()=>{
    logout.classList = "visually-hidden";
    cartBtn.classList = "visually-hidden"; 
    h1.classList = "visually-hidden"
    Array.from(buttons).forEach((a)=>{
        if(a.textContent.trim() == 'Login'){
            a.classList = "btn fw-bold"
        }
        else{
            a.classList = "btn btn-danger"
        }
    })
    
    localStorage.clear();
})

var cartBtn = document.querySelector("#cart-btn");

if(Array.from(cartItems).length > 0){
    cartBtn.innerHTML = `<a style="text-decoration: none; color: white;" href="../../../CartPage/index.html"> Cart [${cartItems.length}]</a>`;
    cartBtn.classList = "btn btn-danger p-2" 
}
