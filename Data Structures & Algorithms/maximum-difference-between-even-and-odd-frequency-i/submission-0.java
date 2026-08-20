class Solution {
    public int maxDifference(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int maxOdd = 0;
        int minEven = s.length();

        // Find largest odd and smallest even
        for (int freq : map.values()) {

            if (freq % 2 != 0) {
                if (freq > maxOdd) {
                    maxOdd = freq;
                }
            }

            if (freq % 2 == 0) {
                if (freq < minEven) {
                    minEven = freq;
                }
            }
        }

        return maxOdd - minEven;
    }
}