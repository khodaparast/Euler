package eulerProject;

/**
 * Created by "P.Khodaparast" on 2017-06-25.
 */
public class P_006 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSums = 0;
        for(int i=1;i<=100;i++){
            int square=i*i;
            sumOfSquares=sumOfSquares+square;
            squareOfSums=squareOfSums+i;

        }
        squareOfSums= (int) Math.pow(squareOfSums,2);
        System.out.println("squareOfSums: "+squareOfSums);
        System.out.println("sumOfSquares: "+sumOfSquares);
        System.out.println(squareOfSums-sumOfSquares);


    }
}
