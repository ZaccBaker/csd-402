public class FanTest {
    public static void main(String [] args){
        
        // Fan instances
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.MEDIUM, true, 27, "Black");

        // Output
        System.out.printf("Fan 1 - Default Values\n\t%s\n\n",fan1.toString());
        System.out.printf("Fan 2 - Custom Values\n\t%s\n\n",fan2.toString());
    }
}
