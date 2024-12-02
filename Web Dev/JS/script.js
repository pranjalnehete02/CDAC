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
<<<<<<< HEAD

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

//-----------------------------------------------------------

//ARRAY

// const array1 = [1, 2, 3, 4, 5, 6, 7];
// console.log(array1);
// /*

// length()
// toString()
// at()
// join()
// pop()
// push()
// unshift()
// delete()

// */

// //foreach
// array1.forEach((Element) => console.log(Element));
// //print the array in row by row

// // const forEachArray = array1.forEach((Element) => Element + 1);
// // console.log(forEachArray);
// //output will be undefined
// //---------------------------------------------------
// //MAP
// console.log("-------------------");
// array1.map((Element) => console.log(Element));
// console.log(array1);

// console.log("-------------------");
// console.log("-------------------");

// //----------------------------------------------------------------
//  const x = array1.forEach((Element) => console.log(Element));
//  console.log("-------------------");

//  const y = array1.map((Element) => console.log(Element));

//  console.log(x);
//  console.log(y);

//  //================================================================
=======
>>>>>>> 13d98c9bd31a1bfcc215460bf12d78651a6d21c2

// //------------------------------------------------
// //hoisting
// //even though the code is written i down after the call
// //then also in the backend it automatically bring the function up

<<<<<<< HEAD
                                            // Objects 
=======
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

//-----------------------------------------------------------

//ARRAY

// const array1 = [1, 2, 3, 4, 5, 6, 7];
// console.log(array1);
// /*

// length()
// toString()
// at()
// join()
// pop()
// push()
// unshift()
// delete()

// */

// //foreach
// array1.forEach((Element) => console.log(Element));
// //print the array in row by row

// // const forEachArray = array1.forEach((Element) => Element + 1);
// // console.log(forEachArray);
// //output will be undefined
// //---------------------------------------------------
// //MAP
// console.log("-------------------");
// array1.map((Element) => console.log(Element));
// console.log(array1);

// console.log("-------------------");
// console.log("-------------------");

// //----------------------------------------------------------------
//  const x = array1.forEach((Element) => console.log(Element));
//  console.log("-------------------");

//  const y = array1.map((Element) => console.log(Element));

//  console.log(x);
//  console.log(y);

//  //================================================================

// Objects
>>>>>>> 13d98c9bd31a1bfcc215460bf12d78651a6d21c2

const student = {
  name: "John",
  age: 20,
  grade: 85,
<<<<<<< HEAD
}
=======
};
>>>>>>> 13d98c9bd31a1bfcc215460bf12d78651a6d21c2

console.log(Object.keys(student));
console.log(Object.values(student));
console.log(Object.entries(student));

const student1 = {
  name: "John1",
  age: 201,
  grade: 851,
<<<<<<< HEAD
}

Object.freeze(student1);

//now this can't be modified further 

//----------------------------------------------------------------

//                BY PARAMETERS 

function hello(){
=======
};

Object.freeze(student1);

//now this can't be modified further

//----------------------------------------------------------------

//                BY PARAMETERS

function hello() {
>>>>>>> 13d98c9bd31a1bfcc215460bf12d78651a6d21c2
  console.log(items);
}

hello(items);

//                Default parameters

// //traditional way
// function hello1(){
//   if(!items){
//     items = "default";
//   }
//   console.log(items);
// }
// hello1(items);

<<<<<<< HEAD


function hello3 (items = "default") {
  console.log(items);
  
}

hello3(items);  
=======
function hello3(items = "default") {
  console.log(items);
}

hello3(items);
>>>>>>> 13d98c9bd31a1bfcc215460bf12d78651a6d21c2
