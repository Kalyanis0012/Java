package Exception;

public class InsufficientBalance extends Exception{
    InsufficientBalance  (String message) { super(message);}
}
class BankAccount{
    static void checkbalance(double balance)throws InsufficientBalance{
        if(balance<500){
            throw new InsufficientBalance("Minimun balance should be 500rs");
        }else{
            System.out.println("Sufficient Balance");
        }
    }

    static void main() {
        try{
            checkbalance(600);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program Ended Successfully..");
    }
}