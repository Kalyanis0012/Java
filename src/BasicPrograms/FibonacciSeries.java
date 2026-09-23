package BasicPrograms;

public class FibonacciSeries {
    public static void main(String[] args){
     int n=15;
     int a=0,b=1;
        System.out.println("Fibonacci Series: ");
        for(int i=0;i<=n; i++){
            System.out.println(a+" ");
             int c=a+b;
             a=b;
             b=c;
        }
    }
}
