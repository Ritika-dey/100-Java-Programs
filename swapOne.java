// swap two numbers using 3rd variable
import java.util.Scanner;
class SwapOne{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Order before swapping "+a+" "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Order after swapping "+a+" "+b);
    }
}