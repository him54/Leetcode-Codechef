class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(i >= 0 || k > 0)
        {
            if(i >= 0)
            {
              list.add((num[i] + k) % 10);
              k = (num[i] + k) / 10;
            }
            else
            {
                list.add(k % 10);
                k = k / 10;
            }
            i--;
        }
        Collections.reverse(list); //a mutable list as an argument and reverses its order in linear time
        return list;
    }
}
