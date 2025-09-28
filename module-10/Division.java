
public abstract class Division {
    protected String division_name;
    protected String account_num;

    public Division(String division_name, String account_num){
        this.division_name = division_name;
        this.account_num = account_num;
    }
    
    public abstract void display();
}
