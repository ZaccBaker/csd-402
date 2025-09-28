
public class InternationalDivision extends Division{
    private String country;
    private String language;

    public InternationalDivision(String division_name, String account_num, String country, String langauge){
        super(division_name,account_num);
        this.country = country;
        this.language = langauge;
    }

    @Override
    public void display(){
        System.out.printf("""
                \nInternational Division
                    Division Name: %s
                    Account Number: %s
                    Country: %s
                    Language: %s
                """,division_name,account_num,country,language);
    }

}
