package carclass;


public class Car {
    public String manufacturerName;
    private String modelName;
    private String carKeyValue = "myname";
    public int engineCC;
    private float fuelAmount;
    final private float amountOfFuelConsumedPerSecond = 0.02f;
    public Car(){
        manufacturerName = new String();
        modelName = new String();
        engineCC = 1000;
        fuelAmount = 0; 
    }
    
    public Car(String carName){
        manufacturerName = new String(carName);
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;
    }
    
    public Car(String manu, String model, String key, int engineCC, float fuel){
        manufacturerName = manu;
        modelName = model;
        carKeyValue = key;
        this.engineCC=engineCC;
        fuelAmount = fuel;
    }
    
    public String getManufacturerName(){
        return manufacturerName;
    }
    
    public float presentAmountofFuel(){
        return fuelAmount;
    }
    
    public String getModelName(){
        return modelName;
    }
    
    public void addFuel(float fuelAmount){
        this.fuelAmount += fuelAmount;
    }
    
    public boolean matchPassWord(String userInput){
        return userInput.equals(carKeyValue);
    }
}
