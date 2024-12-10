interface A{
    // all methods are public abstract by default
    void show();
    void hide();
    // all variable inside interface are by default final and static
    int a = 10;
}

class Interface implements A{
    // implementing abstract methods 
    public void show(){
        System.out.println("Show");
    }
    public void hide(){
        System.out.println("hide");
    }
    public static void main(String args[]){
        Interface obj = new Interface();
        obj.show();
        obj.hide();
        System.out.println(A.a);
    }
}


// for interface with one method is called SAM(single abstract method) 
// and can be defined as a lambda expression while declaration of the object