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
const addToCart = (item) => cart + item;

const addToVal = (item) => (cart = addToCart(item));

addToVal(items.food);
// addToCart(items.food);
addToVal(items.cooldrinks);

console.log(cart);


