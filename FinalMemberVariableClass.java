package learn;

public class FinalMemberVariableClass {
    private int sum;
    private final int VALUE; 
    /** final value means it can't be change next time.
    It is good programming to declare final variable name in capital letters **/
    
    public FinalMemberVariableClass(int x){
        VALUE = x;
    }
    
    public void add(){
        sum += VALUE;
    }
    
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
    
}
