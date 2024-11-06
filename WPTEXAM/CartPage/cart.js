document.addEventListener("DOMContentLoaded",()=>{
var totalItems = document.querySelector("#totalItems");
var cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
var emptyBox = document.querySelector("#empty-box");
var total = 0;

const showEmptyBox = () =>{
    emptyBox.classList = "p-4  container-fluid";
}
const hideEmptyBox = () =>{
 emptyBox.classList = "visually-hidden"
}
console.log(cartItems.length);
if(cartItems.length > 0){
    hideEmptyBox();
}
const calculateTotal =() =>{
    Array.from(cartItems).forEach((item)=>{
        total += Number(item.price);
    });
    var totalBill = document.querySelector(".totalBill");
    totalBill.textContent = `Rs ${total}`;
}
const addItems = () =>{
    var total = 0;
    totalItems.innerHTML = '';
    Array.from(cartItems).forEach((item)=>{
        console.log(item)
        total += Number(item.price);
        var div = document.createElement('div');
        div.classList = "d-md-flex justify-content-between p-5 border rounded";
        div.innerHTML= `
        <img src='${item.imageSrc}' widhth="200px" height="200px">
        <div class="col-md-8 align-content-between">
        <h5>${item.heading}</h5>
        <button class="btn btn-danger " id ="close-btn" data-id="${item.id}"">Delete</button>
         <p class="btn btn-danger d-flex gap-2 p-1 align-items-center justify-content-center mt-2 " id ="add-more" data-id="${item.id + 1}" style="width: 200px;">
         <button class="btn btn-warning" id="decrease">-</button>
         Add More
         <button class="btn btn-warning" id="increase">+</button>
         </p>
        </div>`
        totalItems.appendChild(div);
    });
    var totalBill = document.querySelector(".totalBill");
    totalBill.textContent = `Rs ${total}`;
    var buyBtn = document.querySelector("#buy-btn");
    buyBtn.addEventListener('click',(e)=>{
        if(cartItems.length==0){
            alert("Please Add the Items first!!")
            return;
        }
        else{
            window.location.href = "http://127.0.0.1:5500/CartPage/QrPage/index.html"
        }
        
    })
    var closeButtons = document.querySelectorAll("#close-btn");
    closeButtons.forEach(button => {
        button.addEventListener('click', deleteItem);
    });
    var addToCartButtons = document.querySelectorAll("add-more")
    addToCartButtons.forEach(button => {
        button.children[0].addEventListener('click', counter);
    });

}

const counter = (event) => {
    if(event.target.decrease){
        console.log(event.target.decrease)
    }
    if(event.target.increase){
        console.log(event.target.increase)
    }
}

const deleteItem = (event) => {
    let itemId = event.target.getAttribute("data-id");
    console.log("itemId",itemId);
    cartItems = cartItems.filter(item => item.id != itemId);
    console.log(cartItems);
    localStorage.setItem("cartItems", JSON.stringify(cartItems));
    event.target.closest('div.d-md-flex').remove();
    calculateTotal();
    if(cartItems.length <= 0){
        showEmptyBox();
     }
};

addItems();

});