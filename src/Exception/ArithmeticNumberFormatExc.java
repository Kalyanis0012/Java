package Exception;

public class ArithmeticNumberFormatExc {
    public static void main(String[] args) {
        try {

          /*  int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
           */
           int x=20;
        int y=0;
         int z = x / y;
            System.out.println(z);

        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Pass 2argument");
        } catch (NumberFormatException ne) {
              System.err.println("Pass 2 nos only");
        }catch(ArithmeticException ae ){
            System.err.println("Pass 2nd argument except zero");
        }
    }
}
