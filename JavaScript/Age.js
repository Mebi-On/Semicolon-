// Age below 13 print child
// Age is below 20 and greater than 12 print Teenager
// age is above 20 print Adult
const prompt = require("prompt-sync")({ sigint: true }); 
//const prompt = require (‘prompt-sync’)()

//let age = 20

//if (age <= 13){
//	console.log("Child")
//}
//else if (age > 12 && age < 20){
//	console.log("Teenager")
//}
//else{
//	console.log("Adult")
//}

//let age = 20


//let result = (age < 13) ? console.log("Child"): age < 20 ? console.log("Teenager"): console.log("Adult")

let output = ""

for(let count = 1; count <= 10; count++){
	output += count + " "
} 
console.log(output)

let number = prompt("Enter a number:  ")  
number = Number(number) 
console.log(typeof(number))
console.log(number)