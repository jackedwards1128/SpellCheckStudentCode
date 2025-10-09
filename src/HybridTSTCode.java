public class HybridTSTCode {

    /*
    public void perfectInsertion(String dictionary[], Trie trie) {
        TSTNode position;
        TrieNode triePosition;
        for (String word : dictionary) {
            position = root;
            triePosition = trie.getRoot();

            for (int i = 0; i < word.length();) {
                char letter = word.charAt(i);
                char positions_letter = position.getLetter();

                if(positions_letter == word.charAt(i)) {
                    // If the spot below is empty, we need to optimally set this as the HALF point in the trie's children
                    if (position.getChild(1) == null) {
                        // Find how many children aren't null and create an array of those children
                        TrieNode[] children = triePosition.getChildren();
                        TrieNode[] notNullChildren = new TrieNode[28];
                        int nonNullChildCount = 0;
                        for(int j = 0, n = children.length; j < n; j++) {
                            if (children[j] != null) {
                                notNullChildren[nonNullChildCount++] = children[j];
                            }
                        }
                        // Now, find the median letter and create a node with it
                        char medianLetter = 'm';
                        if (nonNullChildCount != 0)
                            medianLetter = (char)(notNullChildren[nonNullChildCount/2].getLetter() );
                        position.setChild(1, medianLetter);
                    }

                    position = position.getChild(1);

                    triePosition = triePosition.getChild(charToLetterNum(position.getLetter()));
                    i++;
                    continue;
                }

                if (letter - positions_letter > 0) {
                    if (position.getChild(GREATER_CHILD) == null)
                        position.setChild(GREATER_CHILD, letter);

                    position = position.getChild(GREATER_CHILD);
//                    triePosition = triePosition.getChild(charToLetterNum(position.getLetter()));
                } else {
                    if (position.getChild(SMALLER_CHILD) == null)
                        position.setChild(SMALLER_CHILD, letter);

                    position = position.getChild(SMALLER_CHILD);
//                    triePosition = triePosition.getChild(charToLetterNum(position.getLetter()));
                }
            }

            position.setWord();
        }
    }





    public int charToLetterNum (char ch) {
        int letterNum;
        // If the character is an apostrophe, go into index 26
        if (ch == '\'') {
            letterNum = 26;
        } else if (ch > 26 || ch < 0) {
            // Miscellaneous characters that aren't letters or apostrophe go into index 27
            letterNum = 27;
        } else {
            // Convert the ascii to a 0-25 scale for a-z
            letterNum = (ch) - 'a';
        }

        return  letterNum;
    }
     */
}
