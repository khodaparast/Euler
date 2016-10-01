package euler;

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
