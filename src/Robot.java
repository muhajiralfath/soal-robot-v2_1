public class Robot {
    private int x;
    private int y;
    private String direction;

    Robot(String direction, int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move() {
        if (direction.equals("NORTH")) {
            y++;
        } else if (direction.equals("EAST")) {
            x++;
        } else if (direction.equals("SOUTH")) {
            y--;
        } else if (direction.equals("WEST")) {
            x--;
        }
    }

    public void turnRight() {
        if (direction.equals("NORTH")) {
            direction = "EAST";
        } else if (direction.equals("EAST")) {
            direction = "SOUTH";
        } else if (direction.equals("SOUTH")) {
            direction = "WEST";
        } else if (direction.equals("WEST")) {
            direction = "NORTH";
        }
    }

    public void turnLeft() {
        if (direction.equals("NORTH")) {
            direction = "WEST";
        } else if (direction.equals("WEST")) {
            direction = "SOUTH";
        } else if (direction.equals("SOUTH")) {
            direction = "EAST";
        } else if (direction.equals("EAST")) {
            direction = "NORTH";
        }
    }

    public void doCommands(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'A') {
                move();
            } else if (command == 'R') {
                turnRight();
            } else if (command == 'L') {
                turnLeft();
            }
            System.out.println(direction + "->(" + "(" + x + "," + y + ")");
        }
    }
}
