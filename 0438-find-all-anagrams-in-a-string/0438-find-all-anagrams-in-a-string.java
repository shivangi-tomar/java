

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        
        int[] pCount = new int[26]; // Frequency array p k liye 
        int[] sCount = new int[26]; // Sliding window frequency array s k liye
        
        
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();
        
        
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++; 
            
            
            if (i >= windowSize) {
                sCount[s.charAt(i - windowSize) - 'a']--;
            }

           
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - windowSize + 1);
            }
        }
        
        return result;
    }
}
