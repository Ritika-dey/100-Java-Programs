class PrintAlphabet{
    public static void main(String[] args){ 
        for(char ch = 'a'; ch <= 'z'; ch++ ){
            System.out.print(ch +" ");
        }
        System.out.println();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabets.length(); i++){
            System.out.print(alphabets.charAt(i)+" ");
        }
        System.out.println();
    }
}