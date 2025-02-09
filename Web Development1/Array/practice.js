// let arr = [5,6];
// console.log(arr);
// arr.unshift(4);
// console.log(arr);
// arr.push(7);
// console.log(arr);



// function getElement(arr,position){
//  return arr[position-1];

// }
// let arr = [1,2,3,4,5,6,7,8,9,10];
// console.log(getElement(arr,10));

//slice
// let arr = [1,2,3,4,5,6];
// console.log(arr.slice(1,4));


// function arrcopy(arr){
// return arr.slice(0,arr.length);

// }
//  let arr = [1,2,3,4,];
//  let arr2 = arrcopy(arr);
//  arr2[0] = null;
//  console.log(arr);
// console.log(arr2);


// function isPrime(num){
//     for(let i = 2; i < num; i++){
//         if(num % i === 0){
//             return false;
//         }
//     }
//     return true;
// }
// console.log(isPrime(2))
// console.log(isPrime(7))
// console.log(isPrime(21))
// console.log(isPrime(23))

// let num = 2;
// let i = 0;
// while(i < 5){
// if(isPrime(num)){
//     console.log(num);
//     i++
//     if(i>=5){
//         break;
//     }
// }
// num++
// }

// for(let i = 10; i>0; i--){
//     console.log(i);
// }
//  for(let i = 0; i < 10; i++){
//     console.log(10 - i);
//  }


// let nums = [1,-6,5,7,-98]
// for(let i = 0; i < nums.length; i++){
//     if( nums[i] > 0) continue;
//     console.log(nums[i]);
// }


let arr = ['KG', 'Coding','javaScript','Course','is','Best'];
let result = '';
for(let i = 0; i < arr.length; i++){
    result += arr[i] + ' ';
}
console.log(result);

console.log(arr.join(","));