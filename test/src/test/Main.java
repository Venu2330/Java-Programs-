package test;
public class Main {
    public static int findPIN(int input1, int input2, int input3, int input4) {
        int smallestDigitInput1 = getSmallestDigit(input1);
        int largestDigitInput2 = getLargestDigit(input2);
        int largestDigitInput3 = getLargestDigit(input3);

        int pin = (smallestDigitInput1 * largestDigitInput2 * largestDigitInput3) + input4;
        return pin;
    }

    public static int getSmallestDigit(int number) {
        int smallest = Integer.MAX_VALUE;
        int absNumber = Math.abs(number);

        while (absNumber != 0) {
            int digit = absNumber % 10;
            smallest = Math.min(smallest, digit);
            absNumber /= 10;
        }

        return smallest;
    }

    public static int getLargestDigit(int number) {
        int largest = Integer.MIN_VALUE;
        int absNumber = Math.abs(number);

        while (absNumber != 0) {
            int digit = absNumber % 10;
            largest = Math.max(largest, digit);
            absNumber /= 10;
        }

        return largest;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38;

        int pin = findPIN(input1, input2, input3, input4);
        System.out.println("PIN: " + pin);
    }
}
