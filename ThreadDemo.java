package threaddemo;

class NThread extends Thread{
    
    NThread(){
        super("Demo2 Thread");
        System.out.println("Child thread: "+this);
        start();
    }

    @Override
    public void run() {
        try{
            for(int i=5; i>0; i--){
                System.out.println("Child thread:"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
    
}


class TheThread implements Runnable{
    private String name;
    Thread th;
    
    TheThread(String threadname){
        name = threadname;
        th = new Thread(this, name);
        System.out.println("New thread: "+th);
        th.start();
    }

    @Override
    public void run() {
        try{
            for(int i=5; i>0; i--){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(name+" Interrupted");
        }
        System.out.println(name+" exiting");
    }
    
}

public class ThreadDemo {

    public static void main(String[] args) {
        
        new TheThread("One");
        new TheThread("Two");
        new TheThread("Three");
        
        try{
            for(int i=5; i>0; i--){
                //System.out.println("Main Thread: "+i);
                Thread.sleep(10000);
            }
        } catch(InterruptedException e){
            System.out.println("Main THread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
