class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] arr = new boolean[128];

        int maxLen = 0;
        int l = 0, r = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (!arr[ch]) {
                arr[ch] = true;
                maxLen = Math.max(maxLen, r - l + 1);
                r++;
            } else {
                arr[s.charAt(l)] = false;
                l++;
            }
        }

        return maxLen;
    }
}