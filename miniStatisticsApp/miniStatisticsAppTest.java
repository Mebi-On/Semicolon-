import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class miniStatisticsAppTest{

	@Test
	public void testIfVarianceIsCorrect(){
		int[] numbers = {2, 4, 4, 4, 5, 5, 7, 9};
        	double expectedVariance = 4.0;
        	double actualVariance = miniStatisticsApp.findVariance(numbers);
        	assertEquals(expectedVariance, actualVariance, 0.001);
	}
	@Test
	public void testIfStandardDeviationIsCorrect(){
        	int[] numbers = {2, 4, 4, 4, 5, 5, 7, 9};
        	double expectedStandardDeviation = 2.0;
        	double actualStandardDeviation = miniStatisticsApp.findStandardDeviation(numbers);
        	assertEquals(expectedStandardDeviation, actualStandardDeviation, 0.001);
        }	
}