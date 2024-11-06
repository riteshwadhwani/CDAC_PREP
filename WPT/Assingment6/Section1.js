
//Ques 2
function calculateArea(length,breadth){
    console.log(length*breadth);
}

const calcArea = (length,breadth) =>{
console.log(length*breadth);
}


//Ques 3

var book = {
    title:"Effective Java",
    author:"Sandeep Sir",
    year : 2015
}
const bookDetails =(book)=>{
    console.log(book);
}

// Ques 4

var car = {
    model:"Fortuner",
    type:"SUV",
    price: 6000000
}

const{model,type,price} = car;

//Ques 5


let arr = [1,2,3,4,5];

//Ques 6

let sArr = ["Ritesh","Rahul","Mohan","Krishna","Prashant"];

let newArr = sArr.map((x)=>x.length);
console.log(newArr);

//Ques 7

let a = [1,2,3,4,5,6,7,8];

let eventArr = a.filter((x)=>x%2==0);
console.log(eventArr);


//Ques 8

let shoppingCart = [
    {item:"bottle",
     price: 200
    },
    {item:"Pen",
        price: 20
       },
       {item:"Board",
        price: 250
       },
       {item:"Mirror",
        price: 500
       },
       {item:"Copy",
        price: 200
       },
]

let total = shoppingCart.reduce((a,b)=>b.price+a,0);
console.log("total",total);


//Ques 9
let fruits1 = ["mango","apple","banana"];
let fruits2 = ["grapes","tomato","chiku"];

let allFruits = [...fruits1,...fruits2];
console.log("All",allFruits);


//Ques 10

const sum = (a,b)=>{
    return a + b;
}

const executed = (func) =>{
    setTimeout(()=>{
        let a = 3;
        let b = 5;
        func(a,b);
    },4000)
}

executed(sum);




//Ques 11

var myPromise = new Promise((resolve)=>{
    setTimeout(()=>{
        resolve();
    },5000)
})


//Ques 12




//Ques 13

const fetch = ()=>{
    setTimeout(()=>{return "Hi"},10000)
}

const func = async()=>{
    const value = await fetch();
    console.log(value);
}


//Ques 14

const operation = (arr)=>{
   let value =  arr.filter((x)=>x%2).map((a)=>a*2).reduce((a,b)=>a+b,0);
    return value;
}

let array = [1.2,3,4,5,6,7,8];
console.log(operation(array));