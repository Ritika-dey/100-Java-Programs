class ReplaceString{
    public static void main(String[] args){
        String s = "I am learning Java";
        String s2 = s.replace('a','p');
        System.out.println(s2);

        String s3 = s.replaceAll("a", "p");
        System.out.println(s3);
    }
}