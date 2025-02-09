
// let num = 1;      //Initilization
// while(num <= 10){
// console.log(num);
// num++;   // upadtings
// } 
// console.log('final value of num is:' +num);

//While loop

// let x = 0;
// while (x < 1){
// console.log(x);
// x = Math.random() * 2;
// }
// console.log('final value of x is:' + x)


//Do While loop

// let num = 0;
// do{
//     console.log(num);
//     num++;

// } 
// while(num > 5);



// let num;
// for(num = 1; num <= 10; num++){
//     console.log(num);
// }

// let nums = [4,56,8,3,-87,9,78,7,9,55];
// for( i = 0; i<nums.length; i++){
//     console.log(nums[i]);
// }


// Accumulator

// let arr =[3,6,7,9,4];
//  sum = 0;
//  for(i = 0; i < arr.length; i++){
//     sum = sum + arr[i];
    
//  }
//  console.log(`Sum of the arr is ${sum}`)

// let squares = [4,2,3,4,8,6];
//  for(i = 0; i < arr.length; i++){
//     squares[i] = arr[i] * arr[i];
//  }
//  console.log(squares);
 

//  let squares = [4,2,3,4,8,6];
//  for(i = 0; i < squares.length; i++){
//     squares[i] = squares[i] * squares[i];
//  }
//  console.log(squares);
 


//Break

// for(let i = 0; i <=50; i++){
//     console.log(i);
//     if(i == 40 ){
//         break;
        
//     }
// }

// let nums = [4,5,6,4,89,6,5,7,91,2,3];
// for(let i = 0; i < nums.length; i++){
// if(nums[i] == 91){
// console.log(`Number found at Index ${i}`);
// break;
// }
// console.log('Still looking');
// }

for(let i = 1; i <= 25; i++){
    
    // if(i % 2 == 0){
    //     continue;
    //    } 
   if(i % 2 !== 0){
    continue;
   } 
   console.log(i);
}