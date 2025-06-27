
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int countVowels = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i)))
                countVowels++;
        }
        int maxVowels = countVowels;
        for (int i = k; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i-k)))
                countVowels--;
            if (vowels.contains(s.charAt(i)))
                countVowels++;
            maxVowels = Math.max(maxVowels, countVowels);
        }
        return maxVowels;
    }
}