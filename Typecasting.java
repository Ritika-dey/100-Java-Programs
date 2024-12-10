class Typecasting{
    public static void main(String args[]){
        // upcasting
        double a = 2.4;
        int b = (int)a;
        byte c = (byte) b;
        System.out.println(a + " " + b + " " + c);
        // Parent obj1 = (Parent) new Child();  


        // downcasting
        int x = 10;
        float y = x;
        double z = y;
        System.out.println(x + " " + y + " " + z);
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        // Child c = (Child)p;   
    }
}