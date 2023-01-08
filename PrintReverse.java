import java.util.Scanner;

class PrintReverse{
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int temp = n;

        int reverse = 0;
        while(n > 0){
            int rem = n%10;
            reverse = reverse*10 + rem;
            n = n/10;
        }

        System.out.println("Reverse of "+ temp + " is " + reverse);
    }
}