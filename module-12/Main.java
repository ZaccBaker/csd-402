import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String [] args){
        
        // Service collection
        List<yearlyService> serviceList = new ArrayList<>();

        
        // Instances, no parameters
        serviceList.add(new yearlyService());
        serviceList.add(new yearlyService());

        // Instances, one parameter
        serviceList.add(new yearlyService(65));
        serviceList.add(new yearlyService(125));

        // Instances, two parameters
        serviceList.add(new yearlyService(50,32));
        serviceList.add(new yearlyService(78,70));

        // Instances, three parameters
        serviceList.add(new yearlyService(83,40,85));
        serviceList.add(new yearlyService(102,54,99));


        // Display
        DisplayService.collectionService(serviceList);
       
        
    }
}
    