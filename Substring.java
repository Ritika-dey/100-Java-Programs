import java.util.Scanner;

class Substring{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String ans = "";
                for(int k = i; k <= j; k++)
                    ans += s.charAt(k);
                System.out.println(ans);
            }
            
        }

        

    }
}