package MultiThreading.Synchronization;

public class ThreadClassEx {
    public static void main(String[] args) throws Exception{
        Thread t= new Thread(()->{
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("Before start: " +t.getState());
        t.start();
        Thread.sleep(1000);
        System.out.println("After Start:" +t.getState());
        t.join();
        System.out.println("After Completion :" +t.getState());
    }
}
