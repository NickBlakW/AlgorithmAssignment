import java.util.ArrayList;
import java.util.List;

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


        return false;
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
    }
}