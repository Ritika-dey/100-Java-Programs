import mypack.MyPackage;

class Encapsulation{
    public static void main(String ars[]){

        MyPackage obj = new MyPackage();
        obj.setName("Ritika");
        String name = obj.getName();
        System.out.println(name);
    }
}