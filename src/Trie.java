public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public boolean search(String word) {
//        System.out.println(word);
        TrieNode position = root;

        for (int i = 0; i < word.length(); i++) {
            int letterNum = (int)(word.charAt(i)) - 97;
            // Apostrophe
            if (letterNum == -58)
                letterNum = 26;
                // Misc
            else if (letterNum > 26 || letterNum < 0)
                letterNum = 27;

            if (position.getChild(letterNum) == null) {
                return false;
            }
            position = position.getChild(letterNum);
        }
        if (!position.getIsWord())
            return false;

        return true;
    }

    public void insert(String word) {
        TrieNode position = root;

        for (int i = 0; i < word.length(); i++) {
            int letterNum = (int)(word.charAt(i)) - 97;
            // Apostrophe
            if (letterNum == -58)
                letterNum = 26;
            // Misc
            else if (letterNum > 26 || letterNum < 0)
                letterNum = 27;

            if (position.getChild(letterNum) == null) {
                position.insertChild(letterNum);
            }
            position = position.getChild(letterNum);
        }
        position.setWord();
    }
}
