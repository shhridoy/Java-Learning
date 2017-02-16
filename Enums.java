package pkgenum;

class FreshJuice {
        enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
        FreshJuiceSize size;
    }

public class Enums {

    public static void main(String[] args) {
        // TODO code application logic here
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        
        System.out.println("Size: " + juice.size);
    }
    
    
}
