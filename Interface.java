package overload;


class Client implements InterfaceCallback{

    @Override
    public void callback(int param) {
        System.out.println("callback called with "+param);
    }
    
    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces "+"may also define other memebers, too.");
    }
}


class AnotherClient implements InterfaceCallback{

    @Override
    public void callback(int param) {
        System.out.println("Callback called with "+param);
    }
    
}

public class Interface {
   
   public static void main(String[] args) {
      InterfaceCallback cl = new Client();
      InterfaceCallback cl2 = new AnotherClient();
      cl.callback(45);
      //cl.nonIfaceMeth();
      cl = cl2;
      cl.callback(50);
   }
}