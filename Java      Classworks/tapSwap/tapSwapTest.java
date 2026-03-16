import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class tapSwapTest{
	@Test 
	public void testThatArrayIsTapSwapped(){
		int[] number = {2, 5, 7, 4, 6};
		int[] actualResult = new int[] {5, 2, 4, 7, 6};
		int[] expectedArray = tapSwap.tapSwapArray(number);
		assertArrayEquals(expectedArray, actualResult);

	}
	
	@Test 
	public void testThatArrayIsTapSwappedTwo(){
		int[] number = {5, 7, 6, 3, 2, 4};
		int[] actualResult = {7, 5, 3, 6, 4, 2};
		int[] expectedArray = tapSwap.tapSwapArray(number);
		assertArrayEquals(expectedArray, actualResult);

	}
} 