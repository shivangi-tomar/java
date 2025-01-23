class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLength = 0;

        for (String word : words) {
            if (currentLength + word.length() + currentLine.size() > maxWidth) {
                for (int i = 0; i < maxWidth - currentLength; i++) {
                    currentLine.set(i % (currentLine.size() - 1 == 0 ? 1 : currentLine.size() - 1), 
                                    currentLine.get(i % (currentLine.size() - 1 == 0 ? 1 : currentLine.size() - 1)) + " ");
                }
                result.add(String.join("", currentLine));
                currentLine.clear();
                currentLength = 0;
            }
            currentLine.add(word);
            currentLength += word.length();
        }

      
        StringBuilder lastLine = new StringBuilder(String.join(" ", currentLine));
        while (lastLine.length() < maxWidth) {
            lastLine.append(" ");
        }
        result.add(lastLine.toString());

        return result;
    
    }
}