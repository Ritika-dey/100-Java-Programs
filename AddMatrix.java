class AddMatrix{
    public static void main(String[] args){
        int[][] mat1 = new int[3][2];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                mat1[i][j] = i*j;
            }
        }

        int[][] mat2 = new int[3][2];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                mat2[i][j] = i+j;
            }
        }
        // matrix 1
        System.out.println("Matrix 1:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){ 
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }


        // matrix 2
        System.out.println("Matrix 2:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){ 
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Result Matrix:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                int sum = mat1[i][j] + mat2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}