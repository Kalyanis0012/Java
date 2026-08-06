package FunctionalInterfaceANDLambdaExpression;

@FunctionalInterface
interface Expression{
    void add(int a,int b);
}
public class LambdaExp2 {
    static void main() {
        Expression exp=(a,b)->System.out.println(a+b);
        exp.add(12,13);
    }

}
