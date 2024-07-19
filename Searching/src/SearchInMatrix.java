public class SearchInMatrix
{
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                // {12, 22, 33, 44},
                // {25, 35, 45, 55},
                // {36, 39, 48, 60}
        };

        // System.out.println(Arrays.toString(findTarget(matrix, 60)));
        System.out.println(findTarget(matrix, 2));
    }

    static boolean findTarget(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}
