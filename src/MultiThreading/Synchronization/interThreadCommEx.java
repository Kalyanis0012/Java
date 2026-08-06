package MultiThreading.Synchronization;

class Pizza{
    boolean ready=false;
    synchronized void produce(){
        System.out.println("preparing MultiThreading.Synchronization.Pizza..");
        ready=true;
        System.out.println("MultiThreading.Synchronization.Pizza Ready");
        notify();
    }
    synchronized void consume(){
        while(!ready){
            try{
                System.out.println("Customer Waiting..");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Customer got MultiThreading.Synchronization.Pizza!!");
    }
}

public class interThreadCommEx {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Thread customer = new Thread(() -> {
            pizza.consume();
        });
        Thread chef = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pizza.produce();
        });
        customer.start();
        chef.start();
    }
}
