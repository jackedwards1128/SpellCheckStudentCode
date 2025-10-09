import java.util.*;

import static java.lang.Math.round;

import java.util.HashSet;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Jack Edwards
 * */

public class SpellCheck {

    private LargeNode root;

    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */

    public String[] checkWords(String[] text, String[] dictionary) {

        // Hash set to ensure that duplicate misspells aren't insert into the error_words ArrayList
        Set<String> misspelled_words = new HashSet<>();
        ArrayList<String> error_words = new ArrayList<String>();

        // Create dictionary
//        Trie dict = new Trie();
        TST dict = new TST();

        // Fill the data structure with the words of the dictionary
        for (String word : dictionary) {
            dict.insert(word);
        }


        // Use data structure to check the validity of each word in the provided text
        for (String word : text) {
            if (!dict.search(word)) {
                if (!misspelled_words.contains(word)) {
                    misspelled_words.add(word);
                    error_words.add(word);
                }
            }
        }

        // Turn error word list into a String array and return it
        String[] errors = error_words.toArray(new String[misspelled_words.size()]);
        return errors;
    }
}














