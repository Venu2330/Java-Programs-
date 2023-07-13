package test;

public class evenorodd {
    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38;

        int pin = calculatePin(input1, input2, input3, input4);
        System.out.println("PIN: " + pin);
    }

    public static int calculatePin(int input1, int input2, int input3, int input4) {
        int evenSum = 0;
        int oddSum = 0;

        // Calculate sum of even and odd digits in input1
        while (input1 > 0) {
            int digit = input1 % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            input1 /= 10;
        }

        // Calculate sum of even and odd digits in input2
        while (input2 > 0) {
            int digit = input2 % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            input2 /= 10;
        }

        // Calculate sum of even and odd digits in input3
        while (input3 > 0) {
            int digit = input3 % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            input3 /= 10;
        }

        // Calculate PIN based on input4
        if (input4 % 2 == 0) {
            return evenSum - oddSum;
        } else {
            return oddSum - evenSum;
        }
    }
}
