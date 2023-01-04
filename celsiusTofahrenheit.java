import java.util.Scanner;

class celsiusTofahrenheit{
    public static void main(String[] args){
        double celsius;
        double fahrenheit;

        Scanner scan = new Scanner(System.in);
        celsius = scan.nextDouble();

        fahrenheit = (celsius * (9/5.0)) + 32;

        System.out.println(fahrenheit);
    }
}