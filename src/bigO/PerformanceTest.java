package bigO;

public class PerformanceTest {
    public static void main(String[] args) {
        getTime(1000000);
//        getTime(10000000);
//        getTime(100000000);
//        getTime(1000000000);
    }

    public static void getTime (long n) {
        long startTime = System.currentTimeMillis();
        long k = 0;
        //Big O(n)
        /*
        for (int i = 1; i <= n; i++) {
            k = k + 5;
        }
         */

        //Big O(n^2)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k = k + i + j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n = " + n + " is " + (endTime - startTime) + " milliseconds");
    }

}
