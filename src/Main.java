import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        /*
        for (int i = 0; i < N; i++) {
            // Set result to add square if divisible by 2
            if (i % 2 != 0) {
                result += i * i;
            } else {
                continue;
            }
        }
        */
    }

    // Exercise 3
    private static boolean additive(String s) {
        // For deleting indices after check
        StringBuilder sb = new StringBuilder(s);

        if (s.length() < 3) return false;

        // ASCII values are 48 higher than corresponding values
        // If not true check again!
        if (s.charAt(0)-48 + s.charAt(1)-48 == s.charAt(2)-48) {
            return true;
        } else {
            sb.delete(0, 1);

            return additive(sb.toString());
        }
    }

    // Exercise 4
    // ALTERNATIVELY USE int[]
    private static int[] exercise4(int[] list) {

        return null;
    }

    // Exercise 6
    private static int sumDivisibleBy3(int N) {
        if (N == 0) return 0;

        if (N % 3 != 0) {
            return sumDivisibleBy3(N - 1);
        } else {
            return N + sumDivisibleBy3(N - 1);
        }
    }

    // Exercise 7
    private static int[] exercise7(int Z) {
        int result[] = new int[3];

        return result;
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

    private static ArrayList<Integer> fillArray(int size) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        Random randomInt = new Random();

        for (int i = 0; i < size; i++) {
            array.add(randomInt.nextInt(7) + 1);
        }
        return array;
    }



    // Exercise 11
    private static int exercise11(ArrayList<Integer> array) {

        int occurrences = 0;
        int candidate = 0;
        for (int i = 0; i < array.size(); i++) {
            int checking = array.get(i);
            occurrences = Collections.frequency(array, checking);
            candidate = checking;
        }
        if (occurrences >= array.size()/2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        /*System.out.println("------------------------- Exercise 1 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");

        int input_1 = 8; // 1^2 + 3^2 + 5^2 + 7^2 = 84
        System.out.printf("Input:\t %2d %n", input_1);
        System.out.printf("Output:\t %2d %n%n", exercise1(input_1));

        // Test 2
        System.out.println("---- Test 2 ----\n");

        int input_1_2 = 10; // 1^2 + 3^2 + 5^2 + 7^2 + 9^2 = 165
        System.out.printf("Input:\t %2d %n", input_1_2);
        System.out.printf("Output:\t %2d %n%n", exercise1(input_1_2));


        System.out.println("------------------------- Exercise 3 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        String input_3 = "926831"; // Should return true
        System.out.printf("Input is:\t %s%n", input_3);
        System.out.printf("Result is:\t %b %n%n", additive(input_3));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        String input_3_2 = "523376"; // Should return false
        System.out.printf("Input is:\t %s%n", input_3_2);
        System.out.printf("Result is:\t %b %n%n", additive(input_3_2));


        System.out.println("------------------------- Exercise 6 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");
        int input_6 = 4; // 3
        System.out.printf("Input is:\t %d%n", input_6);
        System.out.printf("Result is:\t %d %n%n", sumDivisibleBy3(input_6));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_6_2 = 14; // 3 + 6 + 9 + 12 = 30
        System.out.printf("Input is:\t %d%n", input_6_2);
        System.out.printf("Result is:\t %d %n%n", sumDivisibleBy3(input_6_2));




        System.out.println("------------------------- Exercise 10 -------------------------");
        System.out.println("---- Test 1 ----\n");
        int input_10 = 32; // 5
        System.out.printf("Input is:\t %d%n", input_10);
        System.out.printf("Result is:\t %d %n%n", logTo(input_10));

        // Test 2
        System.out.println("---- Test 2 ----\n");
        int input_10_2 = 4096; // 12
        System.out.printf("Input is:\t %d%n", input_10_2);
        System.out.printf("Result is:\t %d %n%n", logTo(input_10_2));*/

        System.out.println("------------------------- Exercise 11 -------------------------");
        // Test 1
        System.out.println("---- Test 1 ----\n");

        ArrayList<Integer> input_11_1 = new ArrayList<Integer>(Arrays.asList(7,7,3,7,3,1,7,4,7,1,7,5));
        System.out.printf("Input:\t %s %n", input_11_1);
        System.out.printf("Output:\t %s %n%n", exercise11(input_11_1));

        // Test 2
        System.out.println("---- Test 2 ----\n");

        ArrayList<Integer> input_11_2 = new ArrayList<Integer>(fillArray(12));
        System.out.printf("Input:\t %s %n", input_11_2);
        System.out.printf("Output:\t %s %n%n", exercise11(input_11_2));
    }
}