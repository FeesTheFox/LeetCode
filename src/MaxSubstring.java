import java.util.HashMap;
import java.util.Map;

public class MaxSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < l; right++){
            if (!map.containsKey(s.charAt(right)) || map.get(s.charAt(right)) < left){ // if a symbol is not in the map or its index is lesser than left
                map.put(s.charAt(right), right); //adding the symbol and its index in map
                maxLength = Math.max(maxLength,right - left + 1); //updates maxLength if the current substring with no repeats is longer than  maxLength
            } else { // if it's symbol is in map
                left = map.get(s.charAt(right)) + 1; //updates left to the repeated symbol
                map.put(s.charAt(right),right); //updates index symbol in map
            }
        }
        return maxLength;
    }
}
