class Solution{
  public boolean searchMatrix(int[][] matrix, int target) {
    int i = 0;
    int j = matrix[0].length - 1; // initially hamne kha best coordinate konsa rahega ya to app top right utha lo ya to app bottom left uthalo.

    while(i < matrix.length && j >= 0) // Coloumn kabhi negative nahi  ho shkti and Row kabhi bhi matrix[0].length - 1 se greater  nahi ho shkta .
    {
        if(matrix[i][j] == target){
            return true;
        }
        else if(matrix[i][j] > target){
            j--;
        }
        else{
            i++;
        }
    }
    return false;
}
}
