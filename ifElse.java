// biggest number among 3 numbers using if else
import java.util.Scanner;
class biggestNum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b && a>c) System.out.println("Biggest number is: "+a); 
        else if(b>a && b>c) System.out.println("Biggest number is: "+b);
        else System.out.println("Biggest number is: "+c);  
    }
}