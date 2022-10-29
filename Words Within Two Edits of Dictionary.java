class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<queries.length; i++)
        {
            String str1 = queries[i];
            for(int j = 0; j<dictionary.length; j++)
            {
                String str2 = dictionary[j];
                int diff = 0;
                for(int k = 0; k<str2.length(); k++)
                {
                    if(str2.charAt(k) != str1.charAt(k))
                    {
                        diff++;
                    }
                }
                    if(diff<=2)
                    {
                        list.add(str1);
                        break;
                    }
                }
            }
        return list;
    }
}
