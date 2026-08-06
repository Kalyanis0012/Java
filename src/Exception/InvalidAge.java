package Exception;
import java.util.Scanner;

public class InvalidAge extends Exception{
    InvalidAge (String message){
        super(message);
    }
}

class AgeValidate{
    static void validateAge(int age) throws InvalidAge{
        if(age>18){
            System.out.println("Eligible for voting");
        }else{
            throw new InvalidAge("Age must be 18 or above");
        }
    }

    static void main() {
        /*try{
            validateAge(19);
        } catch (InvalidAgeException e) {
            System.err.print("Exception: " +e.getMessage());
        }
        System.out.println("Program continues..");
  */

        //taking input from user
  Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
       int age= sc.nextInt();
       try{
           validateAge(age);
       } catch (InvalidAge e) {
           System.out.println(e.getMessage());;
       }
    }
}
