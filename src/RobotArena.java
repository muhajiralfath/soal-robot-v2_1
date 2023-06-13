import java.util.Scanner;

public class RobotArena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String direction, commands;
        int x, y;
        String[] inputInitialPosition;

        do {
            System.out.println("Masukkan Tiga input berupa arah, x, y! contoh (EAST,2,3)");
            System.out.print("Tentukan posisi awal robot : ");
            inputInitialPosition = scan.nextLine().split(",");
            direction = inputInitialPosition[0].toUpperCase();
            if (inputValidation(scan, inputInitialPosition)) break;
        } while (true);

        commands = inputCommands(scan);

        x = Integer.parseInt(inputInitialPosition[1]);
        y = Integer.parseInt(inputInitialPosition[2]);

        Robot robot = new Robot(direction, x, y);
        robot.doCommands(commands);
    }

    private static String inputCommands(Scanner scan) {
        String commands;
        do {
            System.out.print("Input perintah : ");
            commands = scan.nextLine().toUpperCase();

            if (!commands.matches("^[ARLarl]+$")) {
                System.err.println("Input Salah! MASUKAN A = Jalan. R = Belok Kanan, L = Belok Kiri. Ulangi!");
                System.err.println("Tekan Enter ....");
                scan.nextLine();
            } else {
                break;
            }
        } while (true);
        return commands;
    }

    private static boolean inputValidation(Scanner scan, String[] inputInitialPosition) {
        if ((inputInitialPosition[0].equalsIgnoreCase("EAST") || inputInitialPosition[0].equalsIgnoreCase("WEST") || inputInitialPosition[0].equalsIgnoreCase("NORTH") || inputInitialPosition[0].equalsIgnoreCase("SOUTH"))
                && !inputInitialPosition[1].matches(".*[a-zA-Z].*")
                && !inputInitialPosition[2].matches(".*[a-zA-Z].*")) {
            return true;
        } else {
            System.out.println();
            System.err.println("Input Salah! Ulangi! Tekan Enter .....");
            scan.nextLine();
        }
        return false;
    }
}
