import java.util.ArrayList;

public class Main {

    // Exercise 1
    private static int exercise1(int N) {
        int result = 0;

        for (int i = 0; i < N; i++) {
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


        return 0;
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

        System.out.println(exercise1(8));
        System.out.println(additive("123123"));
        System.out.println(additive("9368164"));
    }
}