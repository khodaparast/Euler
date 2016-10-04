package euler;

import java.util.ArrayList;
import java.util.List;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class P_004 {
    static List<Long> mulValues = new ArrayList<Long>();

    // mul() find  multiple of all two 3-digit values and if this is a palindrome add to mulValue list.
    static List<Long> mul() {
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if (palind((long) (i * j))) {
                    mulValues.add((long) (i * j));
                }

            }
        }
        return mulValues;
    }
//palind() take a number and if it is a palindrome return true.
    static boolean palind(Long n) {

        char[] val = Long.toString(n).toCharArray();
        int i1 = 0;
        int i2 = val.length - 1;
        while (i2 > i1) {
            if (val[i1] != val[i2]) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }
//maxOfPalind() take a list and return max of it.
static Long maxOfPalind(List<Long> l){
    Long max=l.get(0);
    for(int i=1;i<l.size()-1;i++){
        if(l.get(i)>max){
            max=l.get(i);
        }
    }
    return max;
}

    public static void main(String[] args) {
        System.out.println( maxOfPalind(mul()));
    }
}






