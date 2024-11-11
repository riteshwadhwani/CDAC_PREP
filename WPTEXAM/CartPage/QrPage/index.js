document.addEventListener('DOMContentLoaded',()=>{
    var outerdiv = document.querySelector("#show-qr");
var cartList = JSON.parse(localStorage.getItem("cartItems"));

const showQr = () =>{
    cartList.forEach((item)=>{
        let div = document.createElement('div');
        div.classList = "container-fluid"
        let imagSrc =  `https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=${item.heading.trim()}`
        div.innerHTML = `
    <div class="bg-warning card col-12 col-md-6 col-lg-5 justify-content-center align-items-center mt-3 p-4">
        <img src="${imagSrc}" class="card-img-top img-fluid" alt="QR Code for ${item.heading}" width="200" height="200">
        <div class="card-body text-primary text-center">
            <h4 class="card-title p-3 text-bg-success rounded-2">${item.heading}</h4>
        </div>
    </div>`;
        outerdiv.append(div);
    })
}
showQr();

localStorage.removeItem("cartItems");
})