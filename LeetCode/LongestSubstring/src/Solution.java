import java.util.HashMap;
import java.util.LinkedHashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ggububgvfk"));
    }
    public static int lengthOfLongestSubstring(String s) {
        LinkedHashMap<Integer, Character> lettersHashMap = new LinkedHashMap<Integer, Character>();
        int substringLen = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            if(lettersHashMap.containsValue(s.charAt(i))){
                max = Math.max(max, substringLen);
                for(int j = i - substringLen; lettersHashMap.containsValue(s.charAt(i)); j++) {
                    lettersHashMap.remove(j);
                    substringLen--;
                }
                lettersHashMap.put(i, s.charAt(i));
                substringLen++;
            }
            else{
                lettersHashMap.put(i, s.charAt(i));
                substringLen++;
            }
        }
        max = Math.max(max, substringLen);
        return max;
    }
    // the basic idea is, keep a hashmap which stores the characters in string as keys and
    // their positions as values, and keep two pointers which define the max substring.
    // move the right pointer to scan through the string , and meanwhile update the hashmap.
    // If the character is already in the hashmap,
    // then move the left pointer to the right of the same character last found.
    // Note that the two pointers can only move forward.
    public static int lengthOfLongestSubstring2(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> lettersHashMap = new HashMap<Character, Integer>();
        int max = 0;
        for(int i = 0, j = 0; i < s.length(); i++){
            if(lettersHashMap.containsKey(s.charAt(i))){
                j = Math.max(j, lettersHashMap.get(s.charAt(i)) + 1);
            }
            lettersHashMap.put(s.charAt(i),i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }

    public int lengthOfLongestSubstring3(String s) {
        int result = 0;
        int[] cache = new int[256];
        for (int i = 0, j = 0; i < s.length(); i++) {
            j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
            cache[s.charAt(i)] = i + 1;
            result = Math.max(result, i - j + 1);
        }
        return result;
    }
}
