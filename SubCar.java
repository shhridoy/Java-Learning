package carclass;

public class SubCar extends Car{
    
    private float chargeInBattery;
    private String clrString;
    
    public SubCar(){
        super();
    }
    
    public SubCar(String manu, String model, String key, int cc, float fuel, float charge, String col){
        super(manu, model, key, cc, fuel);
        chargeInBattery = charge;
        clrString = col;
    }
    
    public float getchargeInBattery(){
        return chargeInBattery;
    }
    
    public void setchargeInBattery(float chargeInBattery){
        this.chargeInBattery = chargeInBattery;
    }
    
    public void setclrString(String clrString){
        this.clrString = clrString;
    }
    
    public String getclrString(){
        return clrString;
    }
    
}
