public class main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{8,7,9},{4,5,6}};
        int sumDiagonalLine = 0;
        for(int i = 0; i< matrix.length; i++){
            for(int  j = 0; j<matrix[i].length;j++){
                if(i==j){
                    sumDiagonalLine += matrix[i][j];
                }
            }
        }
        System.out.println(sumDiagonalLine);
    }
}
