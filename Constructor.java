class Constructor{
    private int val;

    public Constructor(){
        System.out.println("Default constructor");
    }
    public Constructor(int val){
        this.val = val;
        System.out.println("parameterised constructor");
    }

    public int getVal(){
        return val;
    }

    public static void main(String args[]){
        Constructor obj1 = new Constructor(); // calling default constructor
        Constructor obj2 = new Constructor(5); //calling parameterised constructor
        int x = obj2.getVal();
        System.out.println(x);
    }
}