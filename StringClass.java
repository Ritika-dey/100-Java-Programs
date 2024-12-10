class StringClass{
    public static void main(String args[]){
        // immutable string example
        String str = "Ritika";
        String str1 = new String("Ritu");

        System.out.println("Immutable string: " + str + " " + str1);


        // mutable string classes
        StringBuffer sb = new StringBuffer("Mutable string buffer"); //capacity 25
        // convert it to string
        String s = sb.toString();
        System.out.println(s);


        StringBuilder sbb = new StringBuilder("Mutable string builder string"); // capacity 16
        String ss = sbb.toString();
        System.out.println(ss);
    }
}