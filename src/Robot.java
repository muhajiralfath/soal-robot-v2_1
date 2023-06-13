public class Robot {
    private int x;
    private int y;
    private String direction;

    Robot(String direction, int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getPosition(){
        return direction + "->(" + "(" + x + "," + y + ")";
    }

    public void move() {
        switch (direction) {
            case "NORTH":
                y++;
                break;
            case "EAST":
                x++;
                break;
            case "SOUTH":
                y--;
                break;
            case "WEST":
                x--;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "NORTH":
                direction = "EAST";
                break;
            case "EAST":
                direction = "SOUTH";
                break;
            case "SOUTH":
                direction = "WEST";
                break;
            case "WEST":
                direction = "NORTH";
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "NORTH":
                direction = "WEST";
                break;
            case "WEST":
                direction = "SOUTH";
                break;
            case "SOUTH":
                direction = "EAST";
                break;
            case "EAST":
                direction = "NORTH";
                break;
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
            System.out.println(getPosition());
        }
    }
}
