// Ques 2


// var myPromise = new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         resolve("step 1")
//     },3000)
    
// })

// console.log(myPromise);
// console.log("Process Started!!");
// myPromise.then((m)=>{console.log(m); return new Promise((resolve)=>{
//     setTimeout(()=>{
//         resolve("step 2");
//     },3000)
// })}).then((m)=>{console.log(m)})



//Ques 3

// console.log("Program Started!!");

// var myPromise = new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         resolve({data:"Hello",error:null})
//     },5000)
// })
// console.log("Program Process!!");

// myPromise
// .then((m)=>{console.log(m);
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve("First Promise chain complete!!")
//         },2000)
//     })
// }).then((m)=>{console.log(m)});


// myPromise.then((m)=>{
//     console.log(m);
//     return new Promise((resolve)=>{
//      setTimeout(()=>{
//         resolve("Second Promis Chain Resolved")
//      },10000)   
//     })
// }).then((m)=>{
//     console.log(m);
// })


//Que 4

var a = new Promise((resolve)=>{
    resolve(10);
})

var b = new Promise((resolve)=>{
resolve(20);
})


var promiseArr = [a,b];
Promise.all(promiseArr).then((bodies)=>{
   var val = bodies.reduce((a,b)=>a+b,0);
   console.log(val)
})
