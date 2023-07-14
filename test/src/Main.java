public class Main {
    public static int sumOfNonPrimeIndexValues(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                sum += input[i];
            }
        }
        return sum+input[0]+input[1];
    }

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum1 = sumOfNonPrimeIndexValues(array1);
        System.out.println("Sum 1: " + sum1);

        int[] array2 = {-1, -2, -3, 3, 4, -7};
        int sum2 = sumOfNonPrimeIndexValues(array2);
        System.out.println("Sum 2: " + sum2);

        int[] array3 = {-4, -2};
        int sum3 = sumOfNonPrimeIndexValues(array3);
        System.out.println("Sum 3: " + sum3);
    }
}
