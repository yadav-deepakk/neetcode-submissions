class PrefixTree {

    private static class TrieNode {
        private final TrieNode children[]; 
        private boolean isEndOfWord; 
        public TrieNode() {
            this.children = new TrieNode[26]; 
            this.isEndOfWord = false; 
        }
    } 
    private final TrieNode root; 

    public PrefixTree() {
        this.root = new TrieNode(); 
    }

    public void insert(String word) {
        TrieNode curr = this.root; 
        for(char c : word.toCharArray()) {
            int index = c - 'a'; 
            if(curr.children[index] == null) {
                curr.children[index] = new TrieNode(); 
            }
            curr = curr.children[index]; 
        }
        curr.isEndOfWord = true; 
    }

    public boolean search(String word) {
        TrieNode node = this.findWord(word); 
        return node != null && node.isEndOfWord; 
    }

    public boolean startsWith(String prefix) {
        TrieNode node = this.findWord(prefix); 
        return node != null; 
    }

    public TrieNode findWord(String word) {
        TrieNode curr = this.root; 
        for(char c : word.toCharArray()) {
            int index = c - 'a'; 
            if(curr.children[index] == null) {
                return null; 
            }
            curr = curr.children[index]; 
        }
        return curr; 
    }
}
