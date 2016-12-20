// Knock Knock JS Code:
//Joke Cards:
var JokePartTwo=document.getElementById("joke-part2");
var JokePartThree=document.getElementById("joke-part3");
//Joke buttons
var buttonOne=document.getElementById("button1");
var buttonTwo=document.getElementById("button2");
var buttonThree=document.getElementById("button3");
// replace .hide within the HTML
 console.log('h');
 JokePartTwo.classList.add("hide");
 buttonTwo.classList.add("hide");
 JokePartThree.classList.add("hide");
 buttonThree.classList.add("hide");
 //The code above finds joke2, button2, button 3 and joke3 and hides their content. This is the reason why only the first part of the joke displays on the page
 //from the begining.

// When user clicks first button, show second part
buttonOne.addEventListener("click", function() {
  JokePartTwo.classList.add("show");
  buttonTwo.classList.add("show");
});
 //Code above id finding joke2 and button2 and showing it upon the click of button1

buttonTwo.addEventListener("click", function() {
  JokePartThree.classList.add("show");
  buttonThree.classList.add("show");
});

//Reset button
buttonThree.addEventListener("click", function() {
  JokePartTwo.classList.remove("show");
  buttonTwo.classList.remove("show");
  JokePartThree.classList.remove("show");
  buttonThree.classList.remove("show");
});
//The code below is looking for button3, button2, joke2, and joke3 and hiding them. So user can start from the beginning.
