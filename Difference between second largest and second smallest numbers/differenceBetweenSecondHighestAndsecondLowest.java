import java.util.Arrays; 
public class differenceBetweenSecondHighestAndsecondLowest{
	public static int[] sortList(int [] arrayOfNumbers){
		for (int index = 0; index < arrayOfNumbers.length; index++){
			int minimumIndex = index;
			for (int secondIndex = index + 1; secondIndex < arrayOfNumbers.length; secondIndex++){
				if (arrayOfNumbers[secondIndex] < arrayOfNumbers[minimumIndex]){
					minimumIndex = secondIndex;
				}
				
			}
		int temp = arrayOfNumbers[index];
            	arrayOfNumbers[index] = arrayOfNumbers[minimumIndex];
            	arrayOfNumbers[minimumIndex] = temp;
		}
		return arrayOfNumbers;
	}

	public static int secondLargestNumber(int [] arrayOfNumbers){
		int [] newArrayOfNumbers = new int[arrayOfNumbers.length];
		newArrayOfNumbers = sortList(arrayOfNumbers);
		int secondLargest = newArrayOfNumbers[arrayOfNumbers.length - 2];
		return secondLargest;
	}

	public static int secondLowestNumber(int [] arrayOfNumbers){
		int [] newArrayOfNumbers = new int[arrayOfNumbers.length];
		newArrayOfNumbers = sortList(arrayOfNumbers);
		int secondLowest = newArrayOfNumbers[1];
		return secondLowest;
	}

	public static int difference(int [] arrayOfNumbers){
		if (arrayOfNumbers.length < 4){
			return -1;
		}
		else{return (secondLargestNumber(arrayOfNumbers)  - secondLowestNumber(arrayOfNumbers)); }
	}

	public static void main(String[] args) {
		int [] arrayOfNumbers = {2, 5, 7, 1, 11, 10, 9};
		System.out.println(difference(arrayOfNumbers));
	}
	
} 