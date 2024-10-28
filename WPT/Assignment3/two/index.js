
var f = document.querySelector("#form");
f.addEventListener('submit',(e)=>{
    e.preventDefault();
    displayValue();
})

const displayValue = () =>{
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var contact = document.getElementById("contact").value;
    var mail = document.getElementById("mail").value;
    var pre = document.createElement('pre')
    pre.textContent = `FistName = ${fname}
LastName = ${lname}
Contact = ${contact}
Mail = ${mail}`
    document.querySelector("#showrecords").appendChild(pre); 
    
}

