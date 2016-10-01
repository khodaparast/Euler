package euler;

public class P_01 {
    public static void main(String[] args) {

        sumOfMultiples();
    }
    public static void sumOfMultiples()
    {
        int n=1;
        int sum=0;
        while (n<1000){
            if (n%3==0 || n%5==0){
                sum=sum+n;

            }
            n++;
            System.out.println(sum);
        }
    }

}
