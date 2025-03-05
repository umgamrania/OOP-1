public class Question1 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                matrix[i][j] = (int)(Math.random() * 2);

        for(int i = 0; i < 5; i++) {
            int sum = 0;
            for(int j = 0; j < 5; j++) 
                sum += matrix[i][j];
            
            matrix[i][5] = sum % 2 == 0 ? 1 : 0;
        }

        for(int i = 0; i < 6; i++) {
            int sum = 0;
            for(int j = 0; j < 5; j++) {
                sum += matrix[j][i];
            }

            matrix[5][i] = sum % 2 == 0 ? 1 : 0;
        }

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}