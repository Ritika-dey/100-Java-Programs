class SplitString{
    public static void main(String[] args){
        String s = "I am learning Java";
        String[] words = s.split("\\s");

        for(String x: words){
            System.out.println(x);
        }
    }
}