import java.util.Scanner;

public class Velocity {
    static void vel(int v, int t) {
        int displacement;
        displacement = 2 * v * t;
        System.out.println(displacement);
    }

    public static void main(String[] args) {
        int velocity;
        int time;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            velocity = sc.nextInt();
            time = sc.nextInt();
            vel(velocity, time);
        }
    }
}
