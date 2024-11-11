document.addEventListener("DOMContentLoaded", () => {
  var totalItems = document.querySelector("#totalItems");
  var cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
  var emptyBox = document.querySelector("#empty-box");
  var total = 0;

  const showEmptyBox = () => {
    emptyBox.classList = "p-4  container-fluid";
  };
  const hideEmptyBox = () => {
    emptyBox.classList = "visually-hidden";
  };
  if (cartItems.length > 0) {
    hideEmptyBox();
  }
  const calculateTotal = () => {
    total = 0;
    cartItems.forEach((item) => {
      total += item.price * item.quantity;
    });
    document.querySelector(".totalBill").textContent = `Rs ${total}`;
  };

  const addItems = () => {
    totalItems.innerHTML = "";
    Array.from(cartItems).forEach((item) => {
      console.log(item);
      var div = document.createElement("div");
      div.classList = "d-lg-flex justify-content-between p-5 border rounded";
      div.innerHTML = `
        <img src='${item.imageSrc}' widhth="200px" height="200px">
        <div class="col-md-8 align-content-between">
        <h5>${item.heading}</h5>
        <button class="btn btn-danger" id ="close-btn" data-btn-id="${item.id}"">Delete</button>
         <div class="d-flex gap-2 align-items-center mt-2" style="width: 200px;">
                    <button class="btn btn-warning decrease" data-id="${item.id}">-</button>
                    <span class="quantity">${item.quantity}</span>
                    <button class="btn btn-warning increase" data-id="${item.id}">+</button>
                </div>
        </div>`;
      totalItems.appendChild(div);
    });
    calculateTotal();
    var totalBill = document.querySelector(".totalBill");
    totalBill.textContent = `Rs ${total}`;

    document.querySelectorAll("#close-btn").forEach((button) => {
      button.addEventListener("click", deleteItem);
    });

    document.querySelectorAll(".increase").forEach((button) => {
      button.addEventListener("click", increaseQuantity);
    });

    document.querySelectorAll(".decrease").forEach((button) => {
      button.addEventListener("click", decreaseQuantity);
    });
  };

  const deleteItem = (event) => {
    let itemId = event.target.getAttribute("data-btn-id");
    console.log("itemId", itemId);
    cartItems = cartItems.filter((item) => item.id != itemId);
    console.log(cartItems);
    localStorage.setItem("cartItems", JSON.stringify(cartItems));
    event.target.closest("div.d-lg-flex").remove();
    calculateTotal();
    if (cartItems.length <= 0) {
      showEmptyBox();
    }
  };

  const increaseQuantity = (event) => {
    let itemId = event.target.getAttribute("data-id");
    cartItems = cartItems.map((item) => {
      if (item.id == itemId) {
        item.quantity += 1;
      }
      return item;
    });
    localStorage.setItem("cartItems", JSON.stringify(cartItems));
    addItems();
  };

  const decreaseQuantity = (event) => {
    let itemId = event.target.getAttribute("data-id");
    cartItems = cartItems.map((item) => {
      if (item.id == itemId && item.quantity > 1) {
        item.quantity -= 1;
      }
      return item;
    });
    localStorage.setItem("cartItems", JSON.stringify(cartItems));
    addItems();
  };

  var buyBtn = document.querySelector("#buy-btn");
  buyBtn.addEventListener("click", (e) => {
    let email = JSON.parse(localStorage.getItem("user")).email;
    let length = cartItems.length;
    console.log(email, cartItems.length, total);
    if (cartItems.length == 0) {
      alert("Please Add the Items first!!");
      return;
    } else {
      fetch("http://localhost:4000/order/createOrder", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          email: email,
          orderitems: length,
          orderamount: total,
        }),
      })
        .then((response) => {
          return response.json();
        })
        .then((data) => {
          window.location.href =
            "http://127.0.0.1:5500/CartPage/QrPage/index.html";
        })
        .catch((error) => {
          console.log(error);
        });
    }
  });
  addItems();
});
