class Solution {
    public int[][] transpose(int[][] arr) {
        int row = arr.length;
        int colm=arr[0].length;
        int [][]transpose = new int[colm][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                transpose[j][i] = arr[i][j]; 
            }
        }
        return transpose;
    }
}