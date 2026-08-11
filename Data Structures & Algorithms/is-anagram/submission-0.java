class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { // length check cuz anagrm equal
            return false;
        }

        int[] count = new int[26]; // 26 box created due to constraints

        for (int i = 0; i < s.length(); i++) { // +1 in s and -1 in t for 0
            count[s.charAt(i) - 'a']++;       
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) { // if not 0 then not anagram 
            if (count[i] != 0) {
                return false;
            }
        }
       return true;
    }
}
