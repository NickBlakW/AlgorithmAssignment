import java.util.Arrays;

public class Main {

    // Exercise 1
    private static int recursivePosInt(int N) {
        if (N <= 1) return 1;

        if (N % 2 != 0) {
            return recursivePosInt(N - 2) + (int) Math.pow(N, 2);
        } else {
            return recursivePosInt(N - 1);
        }
    }

    // Exercise 3
    private static boolean additive(String s) {
        if (s.length() < 3) return false;

        // ASCII values are 48 higher than corresponding values
        // If not true check again!
        if (s.charAt(0)-48 + s.charAt(1)-48 == s.charAt(2)-48) {
            return true;
        } else {
            s = s.substring(1);

            return additive(s);
        }
    }

    // Exercise 4
    private static int[] powerCloseToTwo(int[] list) {
        int firstGuess = 0;
        int secondGuess = 0;
        int thirdGuess = 0;
        int powerGuess = 0;
        int[] finalNumbers = new int[4];

        for (int i = 0; i < list.length; i++) {
            int iGuess = list[i];

            for (int j = 0; j < list.length; j++) {
                if (j == i) break;
                int jGuess = list[j];

                for (int k = 0; k < list.length; k++) {
                    if (k == j || k == i) break;
                    int kGuess = list[k];

                    int sum = iGuess + jGuess + kGuess;
                    int maxValue = 0x7fffffff;

                    for (int pow = 1; pow / 2 < sum; pow *= 2) {
                        if (Math.abs(sum - pow) < maxValue) {
                            maxValue = Math.abs(sum - pow);
                            firstGuess = iGuess;
                            secondGuess = jGuess;
                            thirdGuess = kGuess;
                            powerGuess = pow;
                        }
                    }
                }
            }
        }
        finalNumbers[0] = firstGuess;
        finalNumbers[1] = secondGuess;
        finalNumbers[2] = thirdGuess;
        finalNumbers[3] = powerGuess;

        return finalNumbers;
    }

    // Exercise 6
    private static int sumDivByThree(int N) {
        if (N <= 3) return 3;

        if (N % 3 != 0) {
            return sumDivByThree(N - 1);
        } else {
            return N + sumDivByThree(N - 3);
        }
    }

    // Exercise 7
    private static int[] determinePower(int Z) {
        int[] numbers = new int[2];

        if (Z >= 100000) {
            return null;
        }

        for (int i = 3; i < Math.sqrt(Z); i++) {
            for (int j = 3; j < Math.log(Z); j++) {
                int power = (int)Math.pow(i, j);

                if (power == Z) {
                    numbers[0] = i;
                    numbers[1] = j;
                }
            }
        }
        return numbers;
    }

    // Exercise 10
    private static int logTo(int N) {
        if (N < 2) return 0;
        double pow = Math.log(N) / Math.log(2);

        if ((int)(Math.ceil(pow))
           == (int)(Math.floor(pow)))
            return 1 + logTo(N / 2);

        else return -1;
    }

    // Exercise 11
    private static int majorityVote(int[] array) {
        int[] count = new int[8];
        int i, temp;

        for (i = 0; i < array.length; i++) {
            temp = array[i];
            count[temp]++;
        }

        for (i = 1; i < count.length; i++) {
            if (count[i] > array.length / 2) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("------------------------- Exercise 1 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");

        int input_1 = 8;
        System.out.printf("Input:\t %2d %n", input_1);
        System.out.printf("Output:\t %2d %n%n", recursivePosInt(input_1));

        // Test 2
        System.out.println("---- Test 2 ----\n");

        int input_1_2 = 10;
        System.out.printf("Input:\t %2d %n", input_1_2);
        System.out.printf("Output:\t %2d %n%n", recursivePosInt(input_1_2));

        System.out.println("------------------------- Exercise 3 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        String input_3 = "926831";
        System.out.printf("Input is:\t %s%n", input_3);
        System.out.printf("Result is:\t %b %n%n", additive(input_3));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        String input_3_2 = "523376";
        System.out.printf("Input is:\t %s%n", input_3_2);
        System.out.printf("Result is:\t %b %n%n", additive(input_3_2));

        System.out.println("------------------------- Exercise 4 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        int[] input_4 = {23,56,22,11,65,89,3,44,87,910,45,35,98};
        System.out.printf("Input is:\t %s%n", Arrays.toString(input_4));
        System.out.printf("Result is:\t %s%n", Arrays.toString(powerCloseToTwo(input_4)));

        System.out.println("------------------------- Exercise 6 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        int input_6 = 4;
        System.out.printf("Input is:\t %d%n", input_6);
        System.out.printf("Result is:\t %d %n%n", sumDivByThree(input_6));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_6_2 = 14;
        System.out.printf("Input is:\t %d%n", input_6_2);
        System.out.printf("Result is:\t %d %n%n", sumDivByThree(input_6_2));

        System.out.println("------------------------- Exercise 7 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        int input_7 = 3125;
        System.out.printf("Input is:\t %d%n", input_7);
        System.out.printf("Result is:\t %s %n%n", Arrays.toString(determinePower(input_7)));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_7_2 = 6561;
        System.out.printf("Input is:\t %d%n", input_7_2);
        System.out.printf("Result is:\t %s %n%n", Arrays.toString(determinePower(input_7_2)));

        System.out.println("------------------------- Exercise 10 -------------------------");
        System.out.println("---- Test 1 ----\n");
        int input_10 = 32;
        System.out.printf("Input is:\t %d%n", input_10);
        System.out.printf("Result is:\t %d %n%n", logTo(input_10));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_10_2 = 4095;
        System.out.printf("Input is:\t %d%n", input_10_2);
        System.out.printf("Result is:\t %d %n%n", logTo(input_10_2));


        System.out.println("------------------------- Exercise 11 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");

        int[] input_11 = {7,7,3,7,3,1,7,4,7,1,7,5};
        System.out.printf("Input:\t %s %n", Arrays.toString(input_11));
        System.out.printf("Output:\t %s %n%n", majorityVote(input_11));
    }
}