class Solution {
    public int minCost(String colors, int[] neededTime) {
        int min_time = 0;
        int i = 0;
        for (int j = 1; j < colors.length(); j++) {
            if (colors.charAt(i) != colors.charAt(j))
            {
                i = j;
            } else if (neededTime[i] <= neededTime[j])
            {
                min_time += neededTime[i];
                i = j;
            } else
            {
                min_time += neededTime[j];
            }
        }
        return min_time;
    }
}
