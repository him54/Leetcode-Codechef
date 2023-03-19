class Solution {
    int[] nums1 = {-2, -1, 1, 2, -2, -1, 1, 2};
    int[] nums2 = {-1, -2, -2, -1, 1, 2, 2, 1};
    
    public boolean checkValidGrid(int[][] grid)
    {
        int n1 = grid.length;
        int n2 = grid[0].length;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0});
        int num = 0;
        while(!que.isEmpty()) {
            int P = 0;
            int[] curr = que.poll();
            int x = curr[0];
            int y = curr[1];
            for(int i = 0; i < 8; i++) 
            {
                int x1 = x + nums1[i];
                int y1 = y + nums2[i];
                if(x1 >= 0 && x1 < n1 && y1 >= 0 && y1 < n2 && grid[x1][y1] == num + 1) 
                {
                    x = x1;
                    y = y1;
                    P = 1;
                    break;
                }
            }
            if(P == 1) 
            {
                que.add(new int[]{x, y});
            }
            num++;
        }
        if(num == (n1 * n2))
        {
            return true;
        }
        return false;
    }
}
