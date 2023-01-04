// find largest number among given 3 numbers using ternary operator
import java.util.Scanner;
class biggestNum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int biggest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Biggest number is: "+biggest); 
    }
}