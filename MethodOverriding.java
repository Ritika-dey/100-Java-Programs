class A{
    public void show(){
        System.out.println("From A");
    }
}
class B extends A{
    public void show(){
        System.out.println("From B");
    }
}
class C extends A{
    public void show(){
        System.out.println("From C");
    }
}
class MethodOverriding{
    public static void main(String args[]){
        A objA = new A();
        objA.show();

        objA = new B();
        objA.show();

        objA = new C();
        objA.show();
    }
}

// java static methods can't be overrided Because static methods in Java are linked to the class itself 
// rather than any specific instance of the class, we are unable to override them.