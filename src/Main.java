import java.util.ArrayList;

public class Main {

    // Exercise 1
    private static int exercise1(int N) {
        int result = 0;

        for (int i = 0; i < N; i++) {
            // Set result to add square if divisible by 2
            if (i % 2 != 0) {
                result += i * i;
            } else {
                continue;
            }
        }

        return result;
    }

    // Exercise 3
    private static boolean additive(String s) {
        // For deleting indices after check
        StringBuilder sb = new StringBuilder(s);

        if (s.length() < 3) {
            return false;
        }

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
    private static ArrayList<Integer> exercise4(ArrayList<Integer> list) {


        return null;
    }

    // Exercise 6
    private static int sumDivisibleBy3(int N) {
        if (N == 0) {
            return 0;
        }

        if (N % 3 != 0) {
            return sumDivisibleBy3(N - 1);
        } else {
            return N + sumDivisibleBy3(N - 1);
        }
    }

    // Exercise 7
    private static ArrayList<Integer> exercise7(int Z) {


        return null;
    }

    // Exercise 10
    private static long logTo(int N) {


        return 0;
    }

    // Exercise 11
    private static int exercise11(ArrayList<Integer> array, int size) {


        return 0;
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
        int input_6_2 = 10; // 3 + 6 + 9 = 18
        System.out.printf("Input is:\t %d%n", input_6_2);
        System.out.printf("Result is:\t %d %n%n", sumDivisibleBy3(input_6_2));
    }
}