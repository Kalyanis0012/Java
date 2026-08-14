import java.util.Scanner;

public class CountWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        String[] words=s.trim().split("\\s+");
        System.out.println("Number of words in given string: "+words.length);

    }
}
