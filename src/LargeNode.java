public class LargeNode {
    public char letter;
    public boolean valid;
    public LargeNode first_child;
    public LargeNode next_sibling;

    public LargeNode(char letter, boolean valid) {
        this.letter = letter;
        this.valid = valid;
    }
}
