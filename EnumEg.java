enum Laptop{
    //enums are constants, each value defines one object
    Dell(5000), HP(2000), Lenovo(18934);

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
class EnumEg{
    public static void main(String args[]){
        Laptop dell = Laptop.Dell;
        System.out.println(dell.getPrice());
        dell.setPrice(3908);
        System.out.println(dell.getPrice());
    }
}