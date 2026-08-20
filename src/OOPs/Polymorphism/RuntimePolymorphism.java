class Payment{
    void pay(){
        System.out.println("Making payment");
    }
}

class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Payment by UPI");
    }
}

class Card extends Payment{
    @Override
    void pay(){
        System.out.println("Payment done by card");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args){
        Payment p;
        p=new UPI();
        p.pay();

        p=new Card();
        p.pay();
    }
}
