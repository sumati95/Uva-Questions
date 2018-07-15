import java.util.Scanner;

public class Range {
    static void Range ( int ul, int ll) {
            int sum = 0;
            for (int j = ul; j <= ll; j++) {
                if (j % 2 == 1) {
                    sum = sum + j;
                }
            }
            System.out.println(sum);
        }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <= t; i++) {
            int u = sc.nextInt();
            int l = sc.nextInt();
            Range(u, l);
        }
    }
}
