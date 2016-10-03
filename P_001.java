package euler;
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */


public class P_001 {
    public static void main(String[] args) {

        System.out.println(sumOfMultiples());
    }

    static int sumOfMultiples() {
        int n = 1;
        int sum = 0;
        while (n < 1000) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum = sum + n;

            }
            n++;

        }
        return sum;
    }

}
