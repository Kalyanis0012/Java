package WrapperClasses;

public class WrapperToPrimitive_UnBoxing {
    public static void main(String[] args) {

        Integer obj = 50;

        int num = obj;   // Unboxing

        System.out.println("Wrapper: " + obj);
        System.out.println("Primitive: " + num);
    }
}
