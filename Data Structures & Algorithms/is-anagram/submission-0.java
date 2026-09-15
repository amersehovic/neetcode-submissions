class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sInChar = s.toCharArray();
        char[] tInChar = t.toCharArray();

        Arrays.sort(sInChar);
        Arrays.sort(tInChar);

        if(sInChar == tInChar) {
            return true;
        }

        return false;
    }
}
