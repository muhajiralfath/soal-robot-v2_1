import java.util.Scanner;

public class RobotArena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tentukan posisi awal robot : ");
        String[] inputInitialPosition = scan.nextLine().split(",");
        String direction = inputInitialPosition[0].toUpperCase();
        int x = Integer.parseInt(inputInitialPosition[1]);
        int y = Integer.parseInt(inputInitialPosition[2]);

        System.out.println("Input perintah : ");
        String commands = scan.nextLine().toUpperCase();


    }
}
