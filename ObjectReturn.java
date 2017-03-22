package overload;

class Demo{
    int a;
    
    Demo(int i){
        a = i;
    }
    
    Demo incbyten(){
        Demo temp = new Demo(a+10);
        return temp;
    }
}
    

public class ObjectReturn {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Demo obj1 = new Demo(2);
        Demo obj2;
        obj2 = obj1.incbyten();
        System.out.println("obj1.a: "+obj1.a+"\nobj2.a: "+obj2.a);
       
        obj2 = obj2.incbyten();
        System.out.println("obj2.a after second increase: "+obj2.a);
    }
}

/* OUTPUT:

obj1.a: 2
obj2.a: 12
obj2.a after second increase: 22
 */
