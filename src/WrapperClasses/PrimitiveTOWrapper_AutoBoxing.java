package WrapperClasses;

public class PrimitiveTOWrapper_AutoBoxing {
    public static void main(String[] args) {

        int num = 100;

        Integer obj = num;   // Autoboxing

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper: " + obj);
    }
}
