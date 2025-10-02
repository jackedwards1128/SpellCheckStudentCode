public class TrieNode {
    private boolean isWord;
    private TrieNode[] children;

    public TrieNode() {
        children = new TrieNode[28];
    }

    public boolean getIsWord() {
        return isWord;
    }

    public void setWord() {
        isWord = true;
    }

    public void insertChild(int index) {
        children[index] = new TrieNode();
    }

    public TrieNode getChild(int index) {
        return children[index];
    }
}
