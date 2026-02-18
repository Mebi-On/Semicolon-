import java.util.Arrays;

public class FireDrill {

	public static void main(String[] args) {
		int[] numbersArray = TaskOne();
		TaskTwo(numbersArray);
		TaskThree(numbersArray);
		numbersArray = TaskFour(numbersArray);
		TaskFive(numbersArray);
		int[] newNumbersArray = TaskSix(numbersArray);
		int[] sumOfPairs = TaskSeven(newNumbersArray);
		TaskEight(newNumbersArray);
		TaskNine(newNumbersArray);
		TaskTen(newNumbersArray);
		int[] reversedArray = TaskEleven(newNumbersArray);
		TaskTwelve(newNumbersArray, reversedArray);
	    	
	}

	public static int[] TaskOne(){
		int[] numbersArray = new int[10];
		for(int numbers = 0; numbers < 10; numbers ++){
			numbersArray[numbers] = numbers + 1;
		}
		//System.out.println(Arrays.toString(numbersArray));
		for (int number : numbersArray){
			System.out.print(number + " ");
		}
		System.out.println();
        return numbersArray;
	}

	public static void TaskTwo(int[] numbersArray){
		for (int numbers : numbersArray){
			if (numbers % 2 == 0){
				System.out.print(numbers + " ");
			}
		}
		System.out.println();
	}

	public static void TaskThree(int[] numbersArray){
		for (int numbers : numbersArray){
			if (numbers % 2 != 0){
				System.out.print(numbers + " ");
			}
		}
		System.out.println();
	}
	
	public static int[] TaskFour(int[] numbersArray){
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			if (numbersArray[numberIndex] % 3 != 0){
				numbersArray[numberIndex] = 0;
			}
		}
		System.out.println(Arrays.toString(numbersArray));
		return numbersArray;
 	}
	
	public static void TaskFive(int[] numbersArray){
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			if (numbersArray[numberIndex] % 3 != 0){
				numbersArray[numberIndex] = 0;
			}
		}
		for (int numbers : numbersArray){
			if (numbers != 0){
				for (int repeat = 0; repeat < 4; repeat++){
					System.out.print(numbers);
				}
				System.out.print(" ");
			}	
		}
		System.out.println();
	}
	
	public static int[] TaskSix(int[] numbersArray){
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			if (numbersArray[numberIndex] % 3 != 0){
				numbersArray[numberIndex] = 0;
			}
		}
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			numbersArray[numberIndex] = (int)Math.pow(numbersArray[numberIndex],2);
		}
		System.out.println(Arrays.toString(numbersArray));
		return numbersArray;
	}

	public static int[] TaskSeven(int[] newNumbersArray){
		int[] sumOfPairs = new int[5];
		for (int numberIndex = 0; numberIndex < 10; numberIndex += 2){
			sumOfPairs[numberIndex / 2] = newNumbersArray[numberIndex] + newNumbersArray[numberIndex + 1];
		}
		
		System.out.println(Arrays.toString(sumOfPairs));
		return sumOfPairs;
	}
	
	public static int TaskEight(int[] newNumbersArray){
		int sum = 0;
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			sum += newNumbersArray[numberIndex];
		}
		
		System.out.println(sum);
		return sum;
	}

	public static void TaskNine(int[] newNumbersArray){
		int max = 0;
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			if(newNumbersArray[numberIndex] > max){
				max = newNumbersArray[numberIndex];
			}
		}
		
		System.out.println(max);
	}

	public static void TaskTen(int[] newNumbersArray){
		int sum = 0;
		float average = 0;
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			sum += newNumbersArray[numberIndex];
		}
		average = (float)sum/ newNumbersArray.length;
		System.out.println(average);
	}

	public static int[] TaskEleven(int[] newNumbersArray){
		int[] reversedArray = new int[10];
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			reversedArray[numberIndex] = newNumbersArray[newNumbersArray.length - numberIndex -1];
		}

		System.out.println(Arrays.toString(reversedArray));
		return reversedArray;
	}

	public static boolean TaskTwelve(int[] newNumbersArray, int[] reversedArray){
		
		for (int numberIndex = 0; numberIndex < 10; numberIndex ++){
			if (newNumbersArray[numberIndex] != reversedArray[numberIndex]){
				System.out.println("False");
				return false;
			}
		}
		System.out.println("True");
		return true;
	}
}



