
var body = document.querySelector("tbody");

JSON.parse(localStorage.getItem("orders")).forEach((item)=>{
    const{fname,orderid,orderitems,orderamount} = item;
    var tr = document.createElement('tr');
    tr.innerHTML = `<th scope="row">${fname}</th>
                    <td>${orderid}</td>
                    <td>${orderitems}</td>
                    <td>${orderamount}</td>`
                    body.appendChild(tr);
})