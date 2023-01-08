import java.util.Scanner;

class ReverseString{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int len = s.length();
        // Method 1
        String ans = "";
        for(int i = len - 1; i >= 0; i--){
             ans += s.charAt(i);
        }

        System.out.println(ans);


        // Method 2
        char[] ch = s.toCharArray();
        for(int i = 0; i < len/2; i++){
            char temp = ch[i];
            ch[i] = ch[len-1-i];
            ch[len-1-i] = temp;
        }
        System.out.println(ch);
    }
}