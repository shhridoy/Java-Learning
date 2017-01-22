package sample;

public class Function {
    
    private String Name;
    
    public Function(String name){
        Name = name;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getName(){
        return Name;
    }
    
    public void Print(){
        System.out.printf("Your name is %s\n", getName());
    }
    
}
