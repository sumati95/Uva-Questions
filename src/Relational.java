import java.util.Scanner;

public class Relational {
    static void operation(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(" > ");
        }
        else if (n1 < n2) {
            System.out.println(" < ");
        }
        else {
            System.out.println(" = ");
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            operation(n1, n2);
        }
    }
}
