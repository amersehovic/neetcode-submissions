class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] store1 = new int[26];
        int[] store2 = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            store1[s1.charAt(i) - 'a']++;
            store2[s2.charAt(i) - 'a']++;
        }

        int matches = 0;

        for(int i = 0; i < 26; i++) {
            if(store1[i] == store2[i]) {
                matches++;
            }
        }
        
        int l = 0;
        
        for(int r = s1.length(); r < s2.length(); r++) {
            if(matches == 26) {
                return true;
            }

            int index = s2.charAt(r) - 'a';
            store2[index]++;
            if(store1[index] == store2[index]) {
                matches++;
            } else if (store1[index] + 1 == store2[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            store2[index]--;
            if(store1[index] == store2[index]) {
                matches++;
            } else if (store1[index] - 1 == store2[index]) {
                matches--;
            }
            l++;
        }

        return matches == 26;
    }
}
