class Loop{
    public static void main(String[] args){
        // for loop
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }


        // while loop
        int i = 0;
        while(i < 5){
            System.out.println(i*2);
            i++;
        }

        // do while loop
        int n = 5;
        do{
            System.out.println(n*3);
            n--;
        }while(n > 0);
    }
}