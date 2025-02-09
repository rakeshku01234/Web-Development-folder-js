
// let numbers = [ 1,2,3,4,5 ];
// console.log( numbers );
// console.log( numbers [2] );
// console.log( numbers [4] );
 
// let obj = {lkj:95 }
// let doosra = [ 1 ,'true', null, 'asdfasd' ];
// console.log( doosra [ 3 ] );
// console.log( typeof doosra );


// console.log(Array.isArray(doosra))
// console.log(Array.isArray(obj))/

//push/pop

// let arr = [1,2,3];
// console.log(arr);
// arr.push(4,5,6,7);
// console.log(arr);
// console.log('popped ' + arr.pop());
// console.log(arr);
// console.log('popped ' + arr.pop());
// console.log(arr);

//splice
 
// let arr = [3,5,7,6,8,9];
// console.log(arr);
// arr.splice(2,4);
// console.log(arr);

//sort

// let arr = [15,16,17,18,19,10,22,35,45,54,50,65,63];
// console.log(arr);
// arr.sort();
// console.log(arr);

//shift / unshift

// let arr = [2,5,7,9,10];
// console.log(arr);
// arr.shift();
// console.log(arr);
// console.log(arr.valueOf());


// let fruites = ["Payaya","Pineapple","Pomigranates","Guava","perry" ]
// console.log(fruites)
// fruites.push('apple');
// console.log(fruites);
// fruites.pop('apple');
// console.log(fruites);
// fruites.unshift('apple');
// console.log(fruites);
// console.log(fruites[2]);


let arr = [1,2,3,4,5,6,7,8,9,10];
console.log(arr);
arr.toString();
console.log(arr);

let arr2 = arr;
arr2[5]  = 111;
arr2[3]  = 112;
console.log(arr);
let [a,b,c,d] = arr;
console.log(a+" " +b+" " +c+" " +d+" " );
