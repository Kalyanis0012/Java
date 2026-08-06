package MultiThreading.Synchronization;

class ATM {
    synchronized void Withdraw(String name){
        System.out.println(name + " Entered to MultiThreading.Synchronization.ATM");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println( name + " Completed Transaction");

    }
}
public class SynchronizationEx {
    public static void main(String[] args){

        ATM atm=new ATM();
        Thread t1=new Thread(()-> atm.Withdraw("kalyani"));
        Thread t2=new Thread(()->atm.Withdraw("Rahul"));
        Thread t3=new Thread(()->atm.Withdraw("Priya"));

        t1.start();
        t2.start();
        t3.start();
    }
}
