package eulerProject;

public class P_007 {
    public static void main(String[] args) {
        //ans: 104743
        int counter = 2;
        int n = 1_000_000;
        for (int i = 4; i <= n; i++) {
            int no = 0;
            int round = (int) Math.round(Math.sqrt(i)) + 1;
            for (int j = 2; j < round; j++) {
                if (i % j == 0) {
                    no++;
                }
            }
            if (no == 0) {
                counter++;
                System.out.println(counter + "  prime: " + i);
                if (counter == 10001) break;
            }
        }
    }
}
