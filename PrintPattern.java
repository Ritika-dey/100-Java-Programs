import java.util.Scanner;
class PrintPattern{
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        // pattern 1
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        // pattern 2
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}