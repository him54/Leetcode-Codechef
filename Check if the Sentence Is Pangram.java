class Solution {
    public boolean checkIfPangram(String sentence) {
       HashSet<Character>hs = new HashSet<>(); //HashSet contains only unique values
        for(int i = 0; i < sentence.length(); i++) //We can use a Character HashSet and then check the size of the set if it is 26 then the string is a pangram.
        {
            hs.add(sentence.charAt(i));
        }
        return hs.size() == 26;
    }
}
