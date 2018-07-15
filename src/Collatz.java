import java.util.Scanner;

public class Collatz {
    static void luthar(int a, int limit) {
            int count = 0;
            while (a <= limit && a != 1) {
                if (a % 2 == 0) {
                    a = a / 2;
                } else {
                    a = 3 * a + 1;
                }
                count++;
            }
            if (a == 1) {
                count++;
            }
            System.out.println("Case" + " "  + ":" + "A" + "=" + a + "," + "limit" + "=" + limit + "," + "number of terms" + "=" + count);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int l = sc.nextInt();
            luthar(a, l);
        }
    }

