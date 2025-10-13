import java.util.List;

public class DisplayService {
    
    public static void displayService(yearlyService service){ // Format & display output
        
        double total = 0;

        String output = """
                \n\n-- Service Receipt --
                """;


        if(service.getStandard() != 0){
            String msgStandard = String.format("""
                    \u2022 %-30s $%.2f
                    """,
                    "Standard Service Charge:", service.getStandard());

            output += msgStandard;
            total += service.getStandard();
        }   

        if(service.getOilChange() != 0){
            String msgOil = String.format("""
                    \u2022 %-30s $%.2f
                    """,
                    "Oil Change Fee", service.getOilChange());

            output += msgOil;
            total += service.getOilChange();
        }

        if(service.getTireRotation() != 0){
            String msgTire = String.format("""
                    \u2022 %-30s $%.2f
                    """,
                    "Tire Rotation Charge", service.getTireRotation());

            output += msgTire;
            total += service.getTireRotation();
        }

        if(service.getCoupon() != 0){
            String msgOil = String.format("""
                    \u2022 %-30s $%.2f
                    """,
                    "Coupon Amount Applied", service.getCoupon());

            output += msgOil;
            total -= service.getCoupon();
        }

        if(total != 0){
            String msgTotal = String.format("""
                    %s
                    \u2022 %-30s $%.2f
                    """, 
                    "-".repeat(40), "Total Cost of Service", total);

            output += msgTotal;
        }

        System.out.printf(output);
    }

    public static void collectionService(List<yearlyService> services){ // Iterate over collection
        for(yearlyService service : services){
            displayService(service);
        }
    }
}
