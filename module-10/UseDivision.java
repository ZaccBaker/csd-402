
public class UseDivision{
    public static void main(String [] args){

        // Domestic Divisions, instances
        DomesticDivision dom1 = new DomesticDivision("Cornhusker Company", "531035", "Nebraska");
        DomesticDivision dom2 = new DomesticDivision("Roadhouse Regiment", "378948 ", "Texas");

        // International Divisions, instances
        InternationalDivision inter1 = new InternationalDivision("Honor Squad", "420894 ", "South Korea", "Korean");
        InternationalDivision inter2 = new InternationalDivision("Obsidian Division", "960341 ","Germany", "German");

        // Display
        dom1.display();
        dom2.display();
        inter1.display();
        inter2.display();
    }
}