class Solution {
    public int lengthOfLastWord(String s) {

        int len = s.length() - 1;
        int istr = 0;
        int l = 0;
        while(len >=0) {
            if(s.charAt(len) >= 'a' && s.charAt(len) <= 'z' || s.charAt(len) >= 'A' && s.charAt(len) <= 'Z') {
                if(istr == 0)
                    istr++;
                l++;
            } else {
                if (istr != 0) {
                    return l;
            }
        }
        len--;
    }
    return l;
}
}