public class AlgorithmManager {
    public static final int MULTIPLE = 1000;

    public static double rmssd(double[] input) {
        if (input.length < 2) {
            throw new IllegalArgumentException();
        }

        double[] diffArray = new double[input.length - 1];
        diff(input, diffArray);

        return Math.sqrt(sumOfSquares(diffArray) / diffArray.length);
    }

    private static void diff(double[] array, double[] diffArray) {
        for (int i = 0; i < diffArray.length; i++) {
            diffArray[i] = array[i + 1] - array[i];
            diffArray[i] *= MULTIPLE;
        }
    }

    private static double sumOfSquares(double[] array) {
        double sum = 0d;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * array[i];
        }
        return sum;
    }
}
