// let product = {
// name:'T-shirt',
//  price: '789',

//  rating: {
// stars: 4.5,
// noOfReviews: 453,
//  }
// };
// console.log(typeof product);
// console.log(product);
// let str = JSON.stringify(product);
// console.log(typeof str);

// let newProduct = JSON.parse(str);{
// console.log(typeof newProduct);
// console.log(newProduct);

// }


let product = {
name:'T-shirt',
 price: '789',

 rating: {
stars: 4.5,
noOfReviews: 453,
 }
};

// localStorage.getItem('Name', 'KG Coding');
//  localStorage.setItem('Price', '000077');

//  console.log(localStorage.getItem('Name'));
 
//  localStorage.setItem('product',JSON.stringify(product));
//  let product2 = JSON.parse(localStorage.getItem('product'));
//  console.log(product2);
localStorage.removeItem('price');
// localStorage.clear();