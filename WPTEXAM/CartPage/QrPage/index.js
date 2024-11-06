document.addEventListener('DOMContentLoaded',()=>{
    var outerdiv = document.querySelector("#show-qr");
var cartList = JSON.parse(localStorage.getItem("cartItems"));

const showQr = () =>{
    cartList.forEach((item)=>{
        console.log(item.heading)
        let div = document.createElement('div');
        div.classList = "container-fluid"
        let imagSrc =  `https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=${item.heading.trim()}`
        div.innerHTML = `  <div class=" bg-warning card col-lg-6 col-6 justify-content-center align-items-center mt-3 p-4" style="height: 500px;" >
                        <img width="200px" height="200px" src=${imagSrc} class="card-img-top" alt="...">
                        <div class="card-body text-primary">
                          <h4 class="card-title p-3 text-bg-success rounded-2">${item.heading}</h4>
                       </div>`;
        outerdiv.append(div);
    })
}
showQr();

localStorage.removeItem("cartItems");
})