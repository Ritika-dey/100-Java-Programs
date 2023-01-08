class Continue{
    public static void main(String[] args){
        int i = 0;
        while(true){
            if(i == 8) break;
            i++;
            if(i == 3) continue; //skips the next line when i = 3
            System.out.println(i*2);
            
        }
    }
}