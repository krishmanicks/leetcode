class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.sort(strs);
        for (int i = 0; i < strs[0].toCharArray().length; i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                return stringBuilder.toString();
            }
            stringBuilder.append(strs[0].charAt(i));
        }
        return stringBuilder.toString();
    }
}