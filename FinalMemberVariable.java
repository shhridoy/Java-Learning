package learn;

public class FinalMemberVariable {

    public static void main(String[] args) {
        // TODO code application logic here
        FinalMemberVariableClass value = new FinalMemberVariableClass(10);
        
        for(int i=0; i<5; i++){
            value.add();
            System.out.printf("%s", value);
        }
        
        //value.VALUE=15; This statement is illigal bcoz we can't change the value of a final member variable 
    }
}
