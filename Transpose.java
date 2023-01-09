class Transpose{
    public static void main(String[] args){
        int[][] mat = new int[3][2];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                mat[i][j] = i+j;
            }
        }

        int[][] res = new int[2][3];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                res[i][j] = mat[j][i];
            }
        }

        System.out.println("Result Matrix:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){ 
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}