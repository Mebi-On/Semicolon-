//Array lecture

import java.util.Scanner; 
import java.util.Arrays; 



public class ArrayLecture{
	public static void main (String [] args){
		//int[] nums = {7, 8, 3};
		
		//for (int i : nums){ //Enhanced loop

		Scanner scoreCollector = new Scanner (System.in); // new is instantiation creating an object
		int [] scores = new int [10]; //Creates a new array of length 10 
		for (int index = 0; index < 10; index ++){ 
			System.out.print("Enter number");
			int score = scoreCollector.nextInt();
			scores[index] = score;
			//double numberScore - scoreCollector.nextDouble();
	}
	System.out.println(Arrays.toString(scores));
	// output -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	//System.out.println(scores); //note this prints the address of the info and not the content

/**
System.out.println(statuses[i]);
System.out.println(i);}
String name = "Chris";
System.out.print(name.length()); // Here length is a method
System.out.print(scores.length); // Here length is a attribute

int score [] = {50}
char [] characters = new char [6]
characters = {"A", "g", "a", "t", "h", "a"}
String sleeper = new String(character)

	}

}
//Default value of string is null
//Default value of int is 0
//Default value of bool is False
//Enhanced for loop lets you see the elements 

//Class example
Scanner userInput =. New Scanner(System.in);

int[] numbers = new int[5];

for (int index = 0; index < numbers.length; index++){
	System.out.println("")
	numbers[index] = userInput.nextInt();
}
for (int number : numbers){
	System.out.print(number + " ")
}

Inversing an Array
[0, 1, 2, 3, 4]

[4, 3, 2, 1, 0]
Num[index] = num[-index + num.length - 1]

// To print out an array


// println(Arrays.toString(scores)); METHOD 1
// for (int number : numbers){
	// System.out.print(number + " ") METHOD 2


*/

//Multi dimensional array

int[][] numberOfNumbers = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
System.out.print(numberOfNumbers[1][2]); //Output-> 6 (item 2 of array 1)
number [row] [column]

int [] [] = new int [3] [3]  



	Scanner userInput = new Scanner(System.in);
	int [] [] numbers = new int [3] [3];  
	for (int rowindex = 0; rowindex < numbers.length; rowindex ++){
		System.out.println("Input your numbers for this array");
		for (int coloumnindex = 0; coloumnindex < numbers[rowindex].length; coloumnindex ++){ 
//coloumnindex < numbers[rowindex].length is needed as it the rows and columns may be uneven 
			numbers[rowindex][coloumnindex] = userInput.nextInt();
			}
		}
	System.out.println(Arrays.deepToString(numbers));
	}
}

//To prints arrays of an array
// METHOD 1
println(Arrays.deepToString(numbers))

//METHOD 2
for (int rowindex = 0; rowindex < numbers.length; rowindex ++){
	System.out.print("Row" + rowindex +":");
	for (int coloumnindex = 0; coloumnindex <  numbers[rowindex].length; coloumnindex ++){ 
		System.out.print(numbers[rowindex][coloumnindex] + " ");


//Class Exercise 

int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
for (int rowindex = 0; rowindex < numbers.length; rowindex ++){
	System.out.print("Row" + rowindex +":");
	for (int coloumnindex = 0; coloumnindex <  numbers[rowindex].length; coloumnindex ++){ 
		System.out.print(numbers[rowindex][coloumnindex] + " ");

	}
	System.out.println();

}
//Output -> Row0:1 2 3 
	    Row1:4 5 6 
	    Row2:7 8 9 




