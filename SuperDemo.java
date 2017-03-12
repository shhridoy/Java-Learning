package box;

public class SuperDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        BoxWeight mybox1 = new BoxWeight(10, 20, 30, 40);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 5);
        BoxWeight mybox3 = new BoxWeight(); //default
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: "+vol);
        System.out.println("Weight of mybox1 is: "+mybox1.weight+"\n");
        
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: "+vol);
        System.out.println("Weight of mybox2 is: "+mybox2.weight+"\n");
        
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is: "+vol);
        System.out.println("Weight of mybox3 is: "+mybox3.weight+"\n");
        
        vol = myclone.volume();
        System.out.println("Volume of myclone is: "+vol);
        System.out.println("Weight of myclone is: "+myclone.weight+"\n");
        
        vol = mycube.volume();
        System.out.println("Volume of mycube is: "+vol);
        System.out.println("Weight of mycube is: "+mycube.weight+"\n");
    }
}

/** OUTPUT:
Volume of mybox1 is: 6000.0
Weight of mybox1 is: 40.0

Volume of mybox2 is: 24.0
Weight of mybox2 is: 5.0

Volume of mybox3 is: -1.0
Weight of mybox3 is: -1.0

Volume of myclone is: 6000.0
Weight of myclone is: 40.0

Volume of mycube is: 27.0
Weight of mycube is: 2.0
 **/
