import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");  // handle extra spaces
        
        Collections.reverse(Arrays.asList(words));
        
        return String.join(" ", words);
    }
}