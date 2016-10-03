package euler;

/*
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?  

 */
public class P_003 {
    public static void main(String[] args) {
        Long n = 600851475143l;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                n = n / i;

            }


        }
        System.out.println(n);
    }
}

//  answer:6857
