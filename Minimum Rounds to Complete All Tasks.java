class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : tasks)
        {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int res = 0;
        for (int i : map.values()) {
            if (i == 1)
            {
                return -1;
            }
            res += (i + 2) / 3;
        }
        return res;
    }
}
