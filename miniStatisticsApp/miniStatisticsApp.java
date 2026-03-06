public class miniStatisticsApp{

    public static double findVariance(int [] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double mean = (double) sum / numbers.length;

        double varianceSum = 0;
        for (int number : numbers) {
            varianceSum += Math.pow(number - mean, 2);
        }
        double variance = varianceSum / numbers.length;

        return variance;
    }

        public static double findStandardDeviation(int [] numbers){
            double variance = findVariance(numbers);
            return Math.sqrt(variance);
        }
}