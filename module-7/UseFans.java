import java.util.List;

public class UseFans{

    // Displays single fan instance without toString()
    public static void displayFans(Fan fan){
        if(fan.getStatus()){
            System.out.printf("\n\tFan is ON\n\t{Color = %s\n\tSpeed = %d\n\tRadius = %d}\n"
            ,fan.getColor(),fan.getSpeed(),fan.getRadius());
        }else{
            System.out.printf("\n\tFan is OFF\n\t{Color = %s\n\tSpeed = %d\n\tRadius = %d}\n"
            ,fan.getColor(),fan.getSpeed(),fan.getRadius());
        }
    }

    // Method for iterating through collection of fans
    public static void collectionFans(List<Fan> fans){
        for(Fan fan : fans){
            displayFans(fan);
        }
    }

}