package test;

public class PrimeSumCalculator {
    public static void main(String[] args) {
        int[] array = {10,41, 18, 50,43,31, 29, 25, 59, 96, 67};
        int n = 11; // Number of elements in the array
        
        int sum = calculatePrimeSum(array, n);
        System.out.println("Sum of prime numbers (excluding the largest): " + sum);
    }

    public static int calculatePrimeSum(int[] array, int n) {
        int largestPrime = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (isPrime(num)) {
                if (num > largestPrime) {
                    sum += largestPrime;
                    largestPrime = num;
                } else {
                    sum += num;
                }
            }
        }

        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
