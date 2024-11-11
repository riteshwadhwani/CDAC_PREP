
var body = document.querySelector("tbody");
const email = JSON.parse(localStorage.getItem("user")).email;
const getOrdersData = async() =>{
    const response = await fetch(`http://localhost:4000/user/getMyOrders/${email}`);
    const data = await response.json();
    console.log(data)
    data.data.forEach((item)=>{
        const{orderitems,orderamount} = item;
        var tr = document.createElement('tr');
        tr.innerHTML = `
                        <td>${orderitems}</td>
                        <td>${orderamount}</td>`
                        body.appendChild(tr);
    })
}
getOrdersData();