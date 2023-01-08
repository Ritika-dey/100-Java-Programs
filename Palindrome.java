import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int original = n;
        int reverse = 0;
        while(n > 0){
            int rem = n%10;
            reverse = reverse*10 + rem;
            n /= 10;
        }

        if( reverse == original) System.out.println("Given number is palindrome");
        else  System.out.println("Given number is not palindrome");
    }
}