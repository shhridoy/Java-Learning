package random;

public class NewClass {
    public int a;
    public int b;
    
    public NewClass(int i, int j){
        a = i;
        b = j;
    }
    
    public void change(NewClass obj){
        obj.a *= 2;
        obj.b /= 2;
    }
}
