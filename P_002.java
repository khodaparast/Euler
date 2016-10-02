package euler;


public class P_002 {

    static void evenFib() {
        long sum = 0;
        long f1 = 0, f2 = 1;
        long temp;
        while (f2 < 4000000) {
            temp = f1;
            f1 = f2;
            f2 = f2 + temp;
            System.out.println(f2);
            if (f2 % 2 == 0) {
                sum += f2;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        evenFib();
    }
}
