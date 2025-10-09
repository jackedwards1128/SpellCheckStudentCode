public class TrieNode {

    // Instance variables to store whether the node represents a real word, and pointers to its children
    private boolean isWord;
    private TrieNode[] children;

    public TrieNode() {
        // Each node will have 28 indices, for 26 letters, apostrophes, and other miscellaneous characters
        children = new TrieNode[28];
    }

    // Return whether the word represented by the node exists
    public boolean getIsWord() {
        return isWord;
    }

    // Set the validness of the word to true
    public void setWord() {
        isWord = true;
    }

    // Create a new node at a given index. No letter needs to be provided, because the letter is implicitly represented
    // by its index in its parent's children array
    public void insertChild(int index, char letter) {
        children[index] = new TrieNode();
    }

    // Returns the child at a given index
    public TrieNode getChild(int index) {
        return children[index];
    }
}
