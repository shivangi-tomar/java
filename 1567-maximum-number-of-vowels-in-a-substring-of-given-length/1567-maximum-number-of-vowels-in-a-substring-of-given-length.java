import java.util.*;

class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int windowVowels = 0;
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i)))
                windowVowels++;
        }
        maxVowels = windowVowels;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                windowVowels--;
            }
            if (vowels.contains(s.charAt(i))) {
                windowVowels++;
                maxVowels = Math.max(maxVowels, windowVowels);
            }
        }
        return maxVowels;
    }
}
