import java.util.Scanner;

public class Main {
    static void hasm (int hsold, int osold) {
        if (hsold > osold) {
            System.out.println(hsold - osold);
        }
        else {
            System.out.println(osold - hsold);
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int hs = sc.nextInt();
            int os = sc.nextInt();
            hasm(hs, os);
        }
    }
}
