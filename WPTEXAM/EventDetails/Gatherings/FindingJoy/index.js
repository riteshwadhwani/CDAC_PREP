var bookBtn = document.querySelector("#book-btn");
var loginHandler = document.querySelector("#log-sign");
var buttons = loginHandler.getElementsByTagName("button");
var userObj = JSON.parse(localStorage.getItem("user"));
var logout = document.querySelector("#logout-btn");
var cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
if (userObj) {
  Array.from(buttons).forEach((a) => {
    a.classList = "visually-hidden";
  });
  logout.classList = "logout-btn";
}
bookBtn.addEventListener("click", () => {
  userObj = JSON.parse(localStorage.getItem("user"));
  if (userObj) {
    let id = Date.now();
    let heading = document.querySelector("#heading");
    let imageSrc = document.querySelector("#showImage");
    let showObj = {id,
      heading: `${heading.textContent}`,
      quantity:1,
      imageSrc: `${(imageSrc.getAttribute("src"))}`,
      price: 0,
    };
    console.log("showOb",showObj)
    cartItems.push(showObj);
    localStorage.setItem("cartItems", JSON.stringify(cartItems));
    cartBtn.innerHTML = `<a style="text-decoration: none; color: white;" href="../../../CartPage/index.html"> Cart [${cartItems.length}]</a>`;
    cartBtn.classList = "btn btn-danger p-2";
    cartBtn.textContent = `Cart [${cartItems.length}]`;
  } else {
    alert("Please Login First!!");
  }
});

logout.addEventListener("click", () => {
  logout.classList = "visually-hidden";
  cartBtn.classList = "visually-hidden";
  Array.from(buttons).forEach((a) => {
    if (a.textContent.trim() == "Login") {
      a.classList = "btn fw-bold";
    } else {
      a.classList = "btn btn-danger";
    }
  });
  localStorage.clear();
});

var cartBtn = document.querySelector("#cart-btn");

cartBtn.innerHTML = `<a style="text-decoration: none; color: white;" href="../../../CartPage/index.html"> Cart [${cartItems.length}]</a>`;
cartBtn.classList = "btn btn-danger p-2";
