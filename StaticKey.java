public class StaticKey{ 

    static int a;

    public void nonstatic(){
        System.out.println("Non static");
    }
    public static void show(){
        System.out.println("Static");
    } 

    public static void main(String args[]){
        StaticKey obj = new StaticKey(); 
        // non static methods can't be called without a reference object
        obj.nonstatic();

        // static variable and methods can be called directly through classname without reference object
        StaticKey.a = 10;
        System.out.println(StaticKey.a);
        StaticKey.show();
    }
}
