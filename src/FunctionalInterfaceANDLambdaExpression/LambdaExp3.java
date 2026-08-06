package FunctionalInterfaceANDLambdaExpression;

public class LambdaExp3 {
    static void main() {
        Runnable r=()->{
            try{
                for (int i=1;i<=0;i++){
                    System.out.println("child Thread :" +i);
                    Thread.sleep(1000);
                }
            }catch (Exception e){
                System.err.println(e);
            }
        };
        Thread t=new Thread(r);
        t.start();
        try{
            for (int i=0;i<=0;i++){
                System.out.println("Main Thread :" +i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
