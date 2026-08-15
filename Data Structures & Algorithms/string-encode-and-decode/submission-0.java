class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length());
            sb.append("#");
            sb.append(strs.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = str.indexOf("#", i);

            int length = Integer.parseInt(str.substring(i, j));

            j++;

            String s = str.substring(j, j + length);

            result.add(s);

            i = j + length;
        }

        return result;
    }
}