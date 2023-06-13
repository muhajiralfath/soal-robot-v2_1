public class Robot {
    private int x;
    private int y;
    private String direction;

    Robot(String direction, int x, int y){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public void move(){
        if(direction.equals("NORTH")){
            y++;
        }else if (direction.equals("EAST")){
            x++;
        }else if(direction.equals("SOUTH")){
            y--;
        }else if (direction.equals("WEST")){
            x--;
        }
    }
    public void turnRight(){
        if (direction.equals("NORTH")){
            direction = "EAST";
        }else if (direction.equals("EAST")){
            direction = "SOUTH";
        }else if (direction.equals("SOUTH")){
            direction = "WEST";
        }else if (direction.equals("WEST")){
            direction = "NORTH";
        }
    }


}
