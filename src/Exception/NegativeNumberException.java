package Exception;

import java.util.Scanner;

public class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }
}

class Demo{
    void cube(int a) throws NegativeNumberException{
        if (a>0) {
            System.out.println("Cube of given No is: " + (a * a * a));
        }else
                throw new NegativeNumberException("Number cannot be negative.");
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number");
            int x=sc.nextInt();
           try{
               Demo d=new Demo();
               d.cube(x);
           } catch (NegativeNumberException e) {
               System.err.print(e);
           }catch (ArrayIndexOutOfBoundsException e) {

               System.out.println("Please provide a number.");

           } catch (NumberFormatException e) {

               System.out.println("Invalid number.");

           }
        }
    }

