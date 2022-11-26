import java.util.*;
import java.io.*; 
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] zero_rows = new int[grid.length];
        int[] zero_columns = new int[grid[0].length];
        int[] one_rows = new int[grid.length];
        int[] one_columns = new int[grid[0].length];
        
        for(int i = 0; i<grid.length; i++)
        {
            for(int j = 0; j<grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    one_rows[i] += 1;
                    one_columns[j] += 1;
                }
                else{
                    zero_rows[i] += 1;
                    zero_columns[j] += 1;
                }
            }
        }
        for(int i = 0; i<grid.length; i++)
        {
            for(int j = 0; j<grid[0].length; j++)
            {
                grid[i][j] = one_rows[i] + one_columns[j] - zero_rows[i] - zero_columns[j];
            }
        }
        return grid;
    }
}
