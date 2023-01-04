// swap two numbers without using 3rd variable
import java.util.Scanner;
class swapTwo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Order before swapping "+a+" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Order after swapping "+a+" "+b);
    }
}