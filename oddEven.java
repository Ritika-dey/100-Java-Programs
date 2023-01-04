import java.util.Scanner;

class add{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        
        if(a%2 == 0) System.out.println("Given number is Even.");
        else System.out.println("Given number is Odd.");
    }
}