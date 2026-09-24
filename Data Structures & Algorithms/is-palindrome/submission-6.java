class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] letters = clean.toCharArray();

        int end = letters.length - 1;

        for(int i = 0; i < letters.length; i++) {
            if(letters[i] != letters[end]) return false;
            end--;
        }

        return true;
    }
}
