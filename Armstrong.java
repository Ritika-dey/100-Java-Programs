// checking if a three digit number is armstrong number or not
import java.util.Scanner;

class Armstrong{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int temp = a;
        int res = 0;
        while(temp>0){
            int rem = temp%10;
            res += (rem*rem*rem);
            temp /=10;
        }

        if(a == res)System.out.println("Given number is a armstrong number");
        else System.out.println("Given number is not a armstrong number");
    }
}