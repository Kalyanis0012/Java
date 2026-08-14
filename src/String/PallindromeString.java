

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        String reverse="";
        for(int i= s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println("Original = " + s);
        System.out.println("Reverse = " + reverse);
        if(s.equals(reverse)){
            System.out.println("String is Pallindrome");
        }else{
            System.out.println("String is not Pallindrome");
        }
    }
}
