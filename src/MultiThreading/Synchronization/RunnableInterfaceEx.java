package MultiThreading.Synchronization;

class Numbers implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <=5 ; i++) {
            System.out.println(i);
        }
    }
}

public class RunnableInterfaceEx {
    static void main() {
        Numbers n= new Numbers();
        Thread t=new Thread(n);
        t.start();
    }

}
