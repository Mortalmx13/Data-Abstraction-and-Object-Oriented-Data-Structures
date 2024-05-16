package activities;

import java.util.ArrayList;
import java.util.List;

public class Cir {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("programming");
        words.add("algorithm");

        List<String> nonRepeatingWords = getNonRepeatingWords(words);

        System.out.println("Non-repeating words: " + nonRepeatingWords);
    }

    public static List<String> getNonRepeatingWords(List<String> words) {
        List<String> nonRepeatingWords = new ArrayList<>();

        for (String word : words) {
            boolean hasRepeatingLetters = false;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (word.indexOf(c) != word.lastIndexOf(c)) {
                    hasRepeatingLetters = true;
                    break;
                }
            }
            if (!hasRepeatingLetters) {
                nonRepeatingWords.add(word);
            }
        }

        return nonRepeatingWords;
    }
}
