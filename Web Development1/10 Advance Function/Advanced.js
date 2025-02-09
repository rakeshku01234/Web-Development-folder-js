//  let Sum = function (sum1 , sum2){
//     return sum1 + sum2;
// };
// let newSum = Sum;
// console.log(Sum(4,4));



// let sum = function(num1 , num2){
//     return num1 + num2;
// }

// function sumThreeNumbers(num1, num2, num3, sumTwoNumbers) {
//     let sum1 = sumTwoNumbers(num1, num2); 
//     return sumTwoNumbers(sum1, num3);     
// }

// console.log(sumThreeNumbers(4, 5, 6, sum));
// console.log(typeof sumThreeNumbers);



//Arrow Function //

// let Sum = (num1 , num2) => {
//     return num1 + num2;
// }
  
// console.log(Sum(6,8));


// let square = sum =>{
//     return sum * sum ;
// }
// console.log(square(5));


//without curly braces and with Arror function


// let square = num => num*num;
// console.log(square(8)); 



// set timeOut //

// let alarm = function(){
//     console.log('Subh ho gayi, uth jaao.');
// }
// setTimeout(alarm, 5000);
// console.log('Alarm set');

// let alarm = ()  => console.log('Subh ho gayi, uth jaao.'); 
// let timerId = setTimeout(alarm, 5000)
// console.log(`Alarm set with timerID: ${timerId}`);


//setInterval //

//  let alarm = ()  => console.log(`Subh ho gayi, uth jaao. ${new Date()}`); 
// let IntervalId = setInterval(alarm, 1000);
// setTimeout(() => clearInterval(IntervalId), 5000);


// Event //

// let buttonElement = document.querySelector('#my-button');
// let behaviour = event => console.log('I am Clicked');
// buttonElement.addEventListener('click', behaviour);

// let printDate = event => console.log(new Date());
// buttonElement.addEventListener('click', printDate);
// 
// buttonElement.removeEventListener('click',printDate)


// let buttonElement = document.querySelector('#my-button');
// buttonElement.addEventListener('click', event => console.log('I am clicked!'));


//forEach Loop//

// let arr = [3,7,4,9];
// for(let i = 0; i < arr.length; i++){
//     console.log(arr[i]);
// }

//  arr.forEach((num) => console.log(num));

// arr.forEach(function(num){
//     console.log(num);
// });


// for(let i = 0; i < arr.length; i++){
//     console.log(arr[i]);
// }
// function search(arr,num){
//     for(let i = 0; i < arr.length; i++){
//         if(arr[i] === num){
//       console.log(`Element found at: ${i}`);
// return;
//         }
//     }
//     console.log('Element was not found')
// }
// // search(arr,7);

// let arr = [3,7,4,9];
// arr.forEach(num => {
// if( num === 5){
//     return;
// }
// console.log(`visited: ${num}`);
// });

// Array Method  Odds or Even number  //

// let arr = [3,7,4,9,8,5,6,10,12,15,11,20,24,25];
// let Even = arr.filter((num, index) => {
// if( num  % 2 === 0   ){
//     return true;
// }
// else{
//     return false;
// }
// });
// console.log('Even');

// let newEven = arr.filter((num, index) => {
//      num % 2 === 1;

    
// });
// console.log(typeof Even)/


// Array Methods map //

let arr = [1,2,3,4,5,6];
// let square = arr.map((num) =>{
//     return num*num;
// });
let square = arr.map(num => num*num);
console.log(square);
