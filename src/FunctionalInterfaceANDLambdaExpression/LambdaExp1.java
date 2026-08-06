package FunctionalInterfaceANDLambdaExpression;

@FunctionalInterface
interface Test1{
    void show();
}

public class LambdaExp1 {
    static void main() {
        Test t=()->System.out.println("Welcome");
        t.show();
    }
}
