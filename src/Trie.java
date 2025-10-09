public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Searching through the Trie for a given word and returns whether the word is valid within the Trie
    public boolean search(String word) {
        TrieNode position = root;

        // For every letter in the word
        for (int i = 0; i < word.length(); i++) {

            int letterNum;
            char currentLetter = word.charAt(i);
            // If the character is an apostrophe, go into index 26
            if (word.charAt(i) == '\'') {
                letterNum = 26;
            } else if (currentLetter > 26 || currentLetter < 0) {
                // Miscellaneous characters that aren't letters or apostrophe go into index 27
                letterNum = 27;
            } else {
                // Convert the ascii to a 0-25 scale for a-z
                letterNum = (currentLetter) - 'a';
            }

            // If there's no node where the path of the given word should lead, the word doesn't exist in the dictionary
            if (position.getChild(letterNum) == null) {
                return false;
            }
            position = position.getChild(letterNum);
        }
        // If the final node is reached, return whether or not the node is defined as representing a real word
        return position.getIsWord();
    }

    // Inserts a word into the tree
    public void insert(String word) {
        TrieNode position = root;

        for (int i = 0; i < word.length(); i++) {
            int letterNum;

            char currentLetter = word.charAt(i);
            // If the character is an apostrophe, go into index 26
            if (word.charAt(i) == '\'') {
                letterNum = 26;
            } else if (currentLetter > 26 || currentLetter < 0) {
                // Miscellaneous characters that aren't letters or apostrophe go into index 27
                letterNum = 27;
            } else {
                // Convert the ascii to a 0-25 scale for a-z
                letterNum = (currentLetter) - 'a';
            }

            // If there's no node where the path of the given word should lead, create the path
            if (position.getChild(letterNum) == null) {
                position.insertChild(letterNum, currentLetter);
            }
            position = position.getChild(letterNum);
        }
        // Once the final node is reached, set the validness of the word to true
        position.setWord();
    }
}
