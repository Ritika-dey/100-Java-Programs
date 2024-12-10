class A{
    public void show(){
        System.out.println("From A class");
    }
}
class B extends A{
    public void show1(){
        System.out.println("From B class");
    }
}
class C extends A{
    public void show2(){
        System.out.println("From C class");
    }
}
class Inheritance extends B{
    public static void main(String args[]){
        B obj = new B(); 
        obj.show(); // A -> B -> inheritnce
        obj.show1(); // B=> inheritance
    }
}