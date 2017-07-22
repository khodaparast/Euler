package eulerProject;

public class P_009 {

    public static void main(String[] args) {
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
ans: a: 200 b: 375 c: 425  abc=31875000
*/
        int a, b, c;
    outer:for (c = 1; c < 1000; c++) {
            for (b = 1; b < c; b++) {
                for (a = 1; a < b; a++) {
                    int temp1, temp2, temp3;
                    temp1 = a * a;
                    temp2 = b * b;
                    temp3 = c * c;
                    if (temp3 == (temp1 + temp2) && (a + b + c) == 1000) {
                        System.out.println("abc =  " + a * b * c);
                        break outer;
                    }
                }
            }
        }
    }
}
