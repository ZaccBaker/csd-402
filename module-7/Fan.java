public class Fan{

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private variables
    private int speed;
    private boolean status;
    private int radius;
    private String color;


    // Setter and Getter methods
    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public int getRadius(){
        return this.radius;
    }

    public void setRadious(int radius){
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }


    // Constructor with default values
    public Fan() {
        this.speed = STOPPED;
        this.status = false;
        this.radius = 6;
        this.color = "White";
    }

    // Constructor with arguments and sets values
    public Fan(int speed, boolean status, int radius, String color){
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }
}