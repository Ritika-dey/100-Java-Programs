class A{
    public int add(int a, int b){
        return a+b;
    }
    // either change the count of parameters
    public int add(int a, int b, int c){
        return a+b+c;
    }
    // or change the datatype pf parameters
    public double add(double a, double b){
        return a+b;
    }
    // only changing the return type will give ambiguity error
    // eg: public double add(int a, int b) will give error
}
class MethodOverloading extends A{
    public static void main(String args[]){
        A obj = new A();
        int val1 = obj.add(3, 4);
        int val2 = obj.add(7 , 8, 9);
        double val3 = obj.add(2.3 , 4.5);

        System.out.println(val1 + " " + val2 + " " + val3);
    }
}