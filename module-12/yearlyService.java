public class yearlyService {

    // Constant
    public static final double RATE = 150;

    // Variables
    private double standard;
    private double oilChange;
    private double tireRotation;
    private double coupon;

    // Getter & Setters
    public double getStandard(){
        return this.standard;
    }

    public void setStandard(){
        this.standard = RATE;
    }

    public double getOilChange(){
        return this.oilChange;
    }

    public void setOilChange(double oilChange){
        this.oilChange = oilChange;
    }

    public double getTireRotation(){
        return this.tireRotation;
    }

    public void setTireRotation(double tireRotation){
        this.tireRotation = tireRotation;
    }

    public double getCoupon(){
        return this.coupon;
    }

    public void setCoupon(double coupon){
        this.coupon = coupon;
    }


    // Constructors
    public yearlyService(){
        this.standard = RATE;
    }

    public yearlyService(double oilChange){
        this.standard = RATE;
        this.oilChange = oilChange;
    }

    public yearlyService(double oilChange, double tireRotation){
        this.standard = RATE;
        this.oilChange = oilChange;
        this.tireRotation = tireRotation;
    }

    public yearlyService(double oilChange, double tireRotation, double coupon){
        this.standard = RATE;
        this.oilChange = oilChange;
        this.tireRotation = tireRotation;
        this.coupon = coupon;
    }
}
