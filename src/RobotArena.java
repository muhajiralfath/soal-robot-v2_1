import java.util.Scanner;

public class RobotArena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tentukan posisi awal robot : ");
        String[] inputInitialPosition = scan.nextLine().split(",");
        String direction = inputInitialPosition[0].toUpperCase();
        int x = Integer.parseInt(inputInitialPosition[1]);
        int y = Integer.parseInt(inputInitialPosition[2]);

        System.out.print("Input perintah : ");
        String commands = scan.nextLine().toUpperCase();

        Robot robot = new Robot(direction, x, y);
        robot.doCommands(commands);

    }
}
