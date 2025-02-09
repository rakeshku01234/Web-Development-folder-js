
//diplay good morning , good afternoon and good night based on current hours

// let date = new Date();
// // let hours = date.getHours;
// let  hours = 8;
// let heading = document.querySelector('#greeting');
// console.log(hours)
// if(hours > 5 && hours < 12 ){
//     heading.innerText = 'Good Morning';
// }
//  else if ( hours > 12 && hours < 18){
//  heading.innerText = 'Good Afternoon';
//  }
//  else{
//      heading.innerText = 'Good Night';
     
//     }






function doGreeting(personName = 'dear'){
    let date = new Date();
    // let  hours = 8;
let hours = date.getHours;
let heading = document.querySelector('#greeting');

if(hours > 5 && hours < 12 ){
    heading.innerText = `Good Morning  ${personName}`;
}
 else if ( hours > 12 && hours < 18){
 heading.innerText = `Good Afternoon  ${personName}`;
 }
 else{
     heading.innerText = `Good Night ${personName}`;
     }
    }
    doGreeting('Have a lovely Dream ');




    
let noOfTimesClicked = 0;
function buttonPressed(){
   
    noOfTimesClicked++;
    updatebutton()
}
  function updatebutton(){
let button = document.querySelector('#my-button');
  
    if(noOfTimesClicked % 2 == 0){
      button.classList. remove('odd')
      button.classList.add('even') 
    }
    else{
        button.classList. add('odd')
      button.classList.remove('even') 
    }
    
   button.innerText = noOfTimesClicked;
}
updatebutton()