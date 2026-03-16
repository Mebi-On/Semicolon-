import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testDifferenceBetweenSecondHighestAndsecondLowest{
	@Test 
	public void testThatArrayIsSortedCorrectly(){
		int[] number = {2, 5, 7, 1, 6, 9};
		int[] expected = new int[] {1, 2, 5, 6, 7, 9};
		int[] actual = differenceBetweenSecondHighestAndsecondLowest.sortList(number);
		assertArrayEquals(expected, actual);

	}
	
	@Test 
	public void testThatSecondLowestNumberIsCorrect(){
		int[] number = {5, 7, 6, 3, 2, 4};
		int expected = 3;
		int actual = differenceBetweenSecondHighestAndsecondLowest.secondLowestNumber(number);
		assertEquals(expected, actual);


	}
	@Test 
	public void testThatSecondLargestNumberIsCorrect(){
		int[] number = {10,5, 7, 6, 3, 2, 4, 9};
		int expected = 9;
		int actual = differenceBetweenSecondHighestAndsecondLowest.secondLargestNumber(number);
		assertEquals(expected, actual);

	}
	
	@Test 
	public void testThatDifferenceIsCorrect(){
		int[] number = {5, 7, 6, 3, 2, 4};
		int expected = 3;
		int actual = differenceBetweenSecondHighestAndsecondLowest. difference(number);
		assertEquals(expected, actual);

	}
} 