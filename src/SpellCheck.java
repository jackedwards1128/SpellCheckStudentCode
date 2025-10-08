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

//    private Node[] dictionary_tree;

    public String[] checkWords(String[] text, String[] dictionary) {

//        createTree(dictionary);

        Set<String> misspelled_words = new HashSet<>();

        ArrayList<String> error_words = new ArrayList<String>();

        int counter = 0;

        Trie dict = new Trie();
//        TST dict = new TST();

        for (String word : dictionary) {
            dict.insert(word);
        }

        for (String word : text) {
            if (!dict.search(word)) {
                if (!misspelled_words.contains(word)) {
                    misspelled_words.add(word);
                    error_words.add(word);
                }
            }
        }


        System.out.println("done parsing");

        String[] errors = error_words.toArray(new String[misspelled_words.size()]);

        System.out.println("done paring dupes");


//        System.out.print("[");
//        for (int i = 0; i < errors.length; i++) {
//            errors[i] = misspelled_words.remove(0);
//            System.out.print(errors[i] + ", ");
//            if ((i+1) % 20 == 0)
//                System.out.println();
//        }
//        System.out.println("]");

        return errors;
    }


    public void createTree(String[] dictionary) {
        root = new LargeNode('.', false);
        LargeNode position;
        int letter = 0;
        int array_position = 0;

        for(String word : dictionary) {
            position = root;
            letter = 0;

            while (letter != word.length()) {
                // PARSE FOR CHILDREN
                if (position.first_child != null) {
                    position = position.first_child;
                    // Search through the siblings of the first child
                    while (position.letter != word.charAt(letter)) {
                        // If there are no more siblings, make one that corresponds with the letter needed
                        if (position.next_sibling == null)
                            position.next_sibling = new LargeNode(word.charAt(letter), (letter == word.length() - 1));

                        position = position.next_sibling;
                    }
                } else {
                    // Create the first child of the node
                    position.first_child = new LargeNode(word.charAt(letter), (letter == word.length() - 1));
                    position = position.first_child;
                }
                letter++;
            }
            position.valid = true;
        }

        System.out.println("done with fat dictionary");
    }
}














