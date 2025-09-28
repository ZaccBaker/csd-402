
public class DomesticDivision extends Division{    
    private String state;

    public DomesticDivision(String division_name, String account_num, String state){
        super(division_name,account_num);
        this.state = state;
    }

    @Override
    public void display(){
        System.out.printf("""
                \nDomestic Division
                    Division Name: %s
                    Account Number: %s
                    State: %s
                """,division_name,account_num,state);
    }
}
