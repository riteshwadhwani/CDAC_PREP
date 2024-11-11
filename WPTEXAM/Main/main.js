

let cartItems = JSON.parse(localStorage.getItem("cartItems"))||[];
localStorage.setItem("cartItems",JSON.stringify(cartItems));
var loginHandler = document.querySelector("#log-sign");
var h1 = document.querySelector('#nameHeading');
var logbtn = document.querySelector('#logout-btn');
var adminBar = document.querySelector("#adminBar");
var isAdmin = JSON.parse(localStorage.getItem("user")).isAdmin;
var email = JSON.parse(localStorage.getItem("user")).email;
var myOrders = document.getElementById("myOrders");


const showMYOrders = () =>{
    if(JSON.parse(localStorage.getItem("user"))){
        myOrders.setAttribute("class","btn btn-secondary rounded-2 p-2");
    }
}
const hideMyOrders = () =>{
    myOrders.setAttribute("class","visually-hidden");
}
showMYOrders();
myOrders.addEventListener('click',(e)=>{
    window.location.href = "http://127.0.0.1:5500/MyOrders/index.html";
})
const showOrders = () =>{
    if(isAdmin){
        adminBar.setAttribute("class","btn p-3 btn-primary"); 
        myOrders.setAttribute("class","visually-hidden");
    }
    else{
        adminBar.setAttribute("class","visually-hidden"); 
    }
}
showOrders();
const geData = async() =>{
    let token = JSON.parse(localStorage.getItem("user")).token;
    let response = await fetch(`http://localhost:4000/admin/getOrders/${email}`,{
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`, // Attach the token as a Bearer token
            'Content-Type': 'application/json'
        }
    
    });
    let data = await response.json();
    return data;
}
adminBar.addEventListener('click',()=>{
    geData().then((data)=>{localStorage.setItem("orders",JSON.stringify(data.data))
         window.location.href = "http://127.0.0.1:5500/Orders/index.html";
    });
    
})

var buttons = loginHandler.getElementsByTagName('button');
    var userInfo = JSON.parse(localStorage.getItem("user"));
    if(userInfo){
        Array.from(buttons).forEach((a)=>{
            a.classList = "visually-hidden"
        })
        h1.textContent = `Hi ${userInfo.fname}!!`
        h1.style.fontSize ="20px"
        h1.style.color = "#001f3f" 
        h1.classList = "d-none d-lg-block"
        
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
    isAdmin = false;
    hideMyOrders();
    localStorage.clear();
})

var cartBtn = document.querySelector("#cart-btn");

if(Array.from(cartItems).length > 0){
    cartBtn.innerHTML = `<a style="text-decoration: none; color: white;" href="../../../CartPage/index.html"> Cart [${cartItems.length}]</a>`;
    cartBtn.classList = "btn btn-danger p-2" 
}
