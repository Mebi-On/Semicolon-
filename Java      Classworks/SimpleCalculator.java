import java.util.Scanner;

public class SimpleCalculator{
	public static void main(String[] args){

		Scanner userInput = new Scanner (System.in);

		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		boolean continueCals = true;

		while(continueCals){

		System.out.print("How many variables are there?(2 or 3) ");
		int variables = userInput.nextInt();
		System.out.print("Enter operand (+ - * /): ");
		String operand = userInput.next();

		if (variables == 2){
			System.out.print("Enter number 1: ");
			number1 = userInput.nextInt();
			System.out.print("Enter number 2: ");
			number2 = userInput.nextInt();
			System.out.print(number1 + " " + operand + " " + number2 + " = ");

			if (operand.equals("+")){System.out.println(add(number1, number2));} 
			if (operand.equals("-")){System.out.println(subtract(number1, number2));}
			if (operand.equals("*")){System.out.println(multiply(number1, number2));}
			if (operand.equals("/")){System.out.println(division(number1, number2));}
		}

		if (variables == 3){
			System.out.print("Enter number 1: ");
			number1 = userInput.nextInt();
			System.out.print("Enter number 2: ");
			number2 = userInput.nextInt();
			System.out.print("Enter number 3: ");
			number3 = userInput.nextInt();
			System.out.print(number1 + " " + operand + " " + number2 + " " + operand + " " + number3 + " = ");

			if (operand.equals("+")){System.out.println(add(number1, number2, number3));}
			if (operand.equals("-")){System.out.println(subtract(number1, number2, number3));}
			if (operand.equals("*")){System.out.println(multiply(number1, number2, number3));}
			if (operand.equals("/")){System.out.println(division(number1, number2, number3));}
			//else{System.out.println("Invalid Input");}	
		}

			System.out.print("Another?(yes/no) ");
			String cont = userInput.next().toLowerCase();

			if (!cont.equals("yes") | cont.equals("no")){continueCals = false;}
		}


	}

	public static int add(int number1, int number2){
		return number1 + number2;
	}
	public static int add(int number1,int number2,int number3){
		return number1 + number2 + number3;
	}

	public static int subtract(int number1, int number2){
		return number1 - number2;
	}
	public static int subtract(int number1,int number2,int number3){
		return number1 - number2 - number3;
	}

	public static int multiply(int number1, int number2){
		return number1 * number2;
	}
	public static int multiply(int number1,int number2,int number3){
		return number1 * number2 * number3;
	}
	public static double division(float number1, float number2){
		return number1 / number2;
	}
	public static double division(float number1,float number2,float number3){
		return (number1 / number2) / number3;
	}

}


