import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    // Exercise 1
    private static int exercise1(int N) {
        if (N == 0) return 0;

        if (N % 2 != 0) {
            return exercise1(N - 1) + (int) Math.pow(N, 2);
        } else {
            return exercise1(N - 1);
        }
    }

    // Exercise 3
    private static boolean exercise3(String s) {
        // For deleting indices after check
        StringBuilder sb = new StringBuilder(s);

        if (s.length() < 3) return false;

        // ASCII values are 48 higher than corresponding values
        // If not true check again!
        if (s.charAt(0)-48 + s.charAt(1)-48 == s.charAt(2)-48) {
            return true;
        } else {
            sb.delete(0, 1);

            return exercise3(sb.toString());
        }
    }

    // Exercise 4
    private static int[] exercise4(int[] list) {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int power = 0;
        int maxValue = Integer.MAX_VALUE;
        int[] finalNumbers = new int[4];

        for (int i = 0; i < list.length; i++) {
            int ig = list[i];

            for (int j = 0; j < list.length; j++) {
                if (j == i) break;
                int jg = list[j];

                for (int k = 0; k < list.length; k++) {
                    int kg = list[k];
                    if (k == j || k == i) break;

                    int pow = 1;
                    int sum = ig + jg + kg;
                    while (pow / 2 < (sum)) {
                        if (Math.abs(sum - pow) < maxValue) {
                            maxValue = Math.abs(sum - pow);
                            i1 = ig;
                            i2 = jg;
                            i3 = kg;
                            power = pow;
                        }
                        pow *= 2;
                    }
                }
            }
        }
        finalNumbers[0] = i1;
        finalNumbers[1] = i2;
        finalNumbers[2] = i3;
        finalNumbers[3] = power;

        return finalNumbers;
    }

    // Exercise 6
    private static int exercise6(int N) {
        if (N == 0) return 0;

        if (N % 3 != 0) {
            return exercise6(N - 1);
        } else {
            return N + exercise6(N - 1);
        }
    }

    // Exercise 7
    private static int[] exercise7(double n) {
        int base;
        int exponent = 0;
        int[] numbers = new int[2];

        if (n < 100000) {
            while (n >= 10) {
                for (int i = 2; i < 10; i++) {
                    n = Math.pow(n, (float) 1/i);
                    if (n == (int) n) {
                        exponent = i;
                    }

                    System.out.println(n);
                }
            }
        } else return null;

        base = (int) n;
        numbers[0] = base;
        numbers[1] = exponent;
        return numbers;
    }

    // Exercise 10
    private static int exercise10(int N) {
        if (N < 2) return 0;
        double pow = Math.log(N) / Math.log(2);

        if ((int)(Math.ceil(pow))
           == (int)(Math.floor(pow)))
            return 1 + exercise10(N / 2);

        else return -1;
    }

    // To fill an array in exercise 11
    private static ArrayList<Integer> fillArray(int size) {

        ArrayList<Integer> array = new ArrayList<>();
        Random randomInt = new Random();

        for (int i = 0; i < size; i++) {
            array.add(randomInt.nextInt(7) + 1);
        }
        return array;
    }

    // Exercise 11
    private static int exercise11(ArrayList<Integer> array) {
        int[] count = new int[8];
        int i, temp;

        for (i = 0; i < array.size(); i++) {
            temp = array.get(i);
            count[temp]++;
        }

        for (i = 1; i < count.length; i++) {
            if (count[i] >= array.size() / 2) {
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
        System.out.printf("Output:\t %2d %n%n", exercise1(input_1));

        // Test 2
        System.out.println("---- Test 2 ----\n");

        int input_1_2 = 10;
        System.out.printf("Input:\t %2d %n", input_1_2);
        System.out.printf("Output:\t %2d %n%n", exercise1(input_1_2));

        System.out.println("------------------------- Exercise 3 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        String input_3 = "926831";
        System.out.printf("Input is:\t %s%n", input_3);
        System.out.printf("Result is:\t %b %n%n", exercise3(input_3));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        String input_3_2 = "523376";
        System.out.printf("Input is:\t %s%n", input_3_2);
        System.out.printf("Result is:\t %b %n%n", exercise3(input_3_2));

        System.out.println("------------------------- Exercise 4 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        int[] input_4 = {23,56,22,11,65,89,3,44,87,910,45,35,98};
        System.out.printf("Input is:\t %s%n", Arrays.toString(input_4));
        System.out.printf("Result is:\t %s%n", Arrays.toString(exercise4(input_4)));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int[] input_4_2 = {89,58,2654,346,465,18,44,46,6,313,64,65};
        System.out.printf("Input is:\t %s%n", Arrays.toString(input_4_2));
        System.out.printf("Result is:\t %s%n", Arrays.toString(exercise4(input_4_2)));

        System.out.println("------------------------- Exercise 6 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        int input_6 = 4;
        System.out.printf("Input is:\t %d%n", input_6);
        System.out.printf("Result is:\t %d %n%n", exercise6(input_6));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_6_2 = 14;
        System.out.printf("Input is:\t %d%n", input_6_2);
        System.out.printf("Result is:\t %d %n%n", exercise6(input_6_2));

        System.out.println("------------------------- Exercise 7 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        int input_7 = 3125;
        System.out.printf("Input is:\t %d%n", input_7);
        System.out.printf("Result is:\t %s %n%n", Arrays.toString(exercise7(input_7)));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_7_2 = 14;
        System.out.printf("Input is:\t %d%n", input_7_2);
        System.out.printf("Result is:\t %d %n%n", exercise6(input_7_2));

        System.out.println("------------------------- Exercise 10 -------------------------");
        System.out.println("---- Test 1 ----\n");
        int input_10 = 32;
        System.out.printf("Input is:\t %d%n", input_10);
        System.out.printf("Result is:\t %d %n%n", exercise10(input_10));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_10_2 = 4095;
        System.out.printf("Input is:\t %d%n", input_10_2);
        System.out.printf("Result is:\t %d %n%n", exercise10(input_10_2));

        System.out.println("------------------------- Exercise 11 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        ArrayList<Integer> input_11_1 = new ArrayList<>(Arrays.asList(7,7,3,7,3,1,7,4,7,1,7,5));
        System.out.printf("Input:\t %s %n", input_11_1);
        System.out.printf("Output:\t %s %n%n", exercise11(input_11_1));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        ArrayList<Integer> input_11_2 = new ArrayList<>(fillArray(12));
        System.out.printf("Input:\t %s %n", input_11_2);
        System.out.printf("Output:\t %s %n%n", exercise11(input_11_2));
    }
}