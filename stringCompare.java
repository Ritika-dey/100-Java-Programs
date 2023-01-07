import java.util.Scanner;
class StringCompare{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();


        if(s1.compareTo(s2) == 0) System.out.println(s1+" and "+ s2 + " are equal");
        else System.out.println(s1+" and "+ s2 + " are not equal");
    }
}