import java.util.List;
import java.util.ArrayList;

public class FanTest {
    public static void main(String [] args){
        
        // Fan collection
        List<Fan> fanList = new ArrayList<>(); 

        // Fan instances
        fanList.add(new Fan());
        fanList.add(new Fan(Fan.STOPPED,false,4,"Grey"));
        fanList.add(new Fan(Fan.SLOW,true,6,"Black"));
        fanList.add(new Fan(Fan.MEDIUM,true,12,"Blue"));
        fanList.add(new Fan(Fan.FAST,true,22,"Green"));

        // Display outputs
        System.out.println("Fan collection output");
        UseFans.collectionFans(fanList);
    }
}
