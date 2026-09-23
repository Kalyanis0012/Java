package BasicPrograms;

public class PallindromeNumber {
    public static void main(String[] args) {
        int num=121;
        int original=num;
        int reverse=0;

        while(num!=0){
            int digit=num%10;
            reverse=reverse*10 +digit;
            num=num/10;
        }

        if(original==reverse){
            System.out.println("number is pallindrome");

        }else{
            System.out.println("Number is not pallindrome");
        }
    }
}
