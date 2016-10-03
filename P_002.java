package euler;

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

Q: By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 find the sum of the even-valued terms.


 */

public class P_002 {

    static void evenFib() {
        long sum = 0;
        long f1 = 0, f2 = 1;
        long temp;
        while (f2 < 4000000) {
            temp = f1;
            f1 = f2;
            f2 = f2 + temp;
            
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




// answer:4613732
