// console.log("Hello world!");
// console.log(window);
// console.log(window.document);

// // accountId = 2408400;
// // console.log(accountId)

// PRN = 201

// accountId =  PRN + 1
// console.log(accountId)

const items = {
  food: 2000,
  cooldrinks: 3000,
};

var cart = 0;

// function addToCart(a,b) {
//     console.log("I'm new functionality");
//     cart = cart+ a;
//     cart = cart+ b;

// }

// // cart = cart + items.food;
// // cart = cart + items.food;
// // cart = cart + items.food;
// // cart = cart + items.cooldrinks;

// addToCart(items.cooldrinks, items.food);

// console.log("cart: ", cart);

//Normal way to define function
//--------------------------------------------
// function addToCart(item){
//     cart = cart + item;

// }

//arrow function
// const addToCart = (item) => cart + item;

// const addToVal = (item) => (cart = addToCart(item));

// addToVal(items.food);
// // addToCart(items.food);
// addToVal(items.cooldrinks);

// console.log(cart);

// //------------------------------------------------
// //hoisting
// //even though the code is written i down after the call
// //then also in the backend it automatically bring the function up

// addToCart1();
// function addToCart1(item) {
//   cart = cart + item;
// }

//hoisting why not in arrow function
// sayHii();
// const sayHii = () => console.log("Hiii");
/*
This will throughthe following error:
script.js:65 Uncaught ReferenceError: Cannot access 'sayHii' before initialization
    at script.js:65:1
*/

//--------------------------------------------------------
//this
//console.log(this);
//o/p will be window function
const thisExample = {
  name: "Pranjal",
  getThis: function () {
    console.log(this);
  },
};

thisExample.getThis();
//this will print the thisExample
//*******************/
//if above example converted into arrow function the
//output will be window function

const thisExample1 = {
  name: "Pranjal",
  getThis: () => {
    console.log(this);
  },
};

thisExample1.getThis();
//Arrow function by default refers the parent obj
// browser -> Window
// PC -> {}

//PURPOSE OF THIS is to access the current exe obj
