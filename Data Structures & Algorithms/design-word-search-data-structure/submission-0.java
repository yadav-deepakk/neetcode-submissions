class WordDictionary {
    private final class TrieNode{
        private TrieNode[] children;
        private boolean isEndOfWord; 
        public TrieNode() {
            this.children = new TrieNode[26]; 
            this.isEndOfWord = false; 
        }
    }
    private final TrieNode root; 

    public WordDictionary() {
        this.root = new TrieNode(); 
    }

    public void addWord(String word) {
        TrieNode curr = this.root; 
        for(int i=0; i<word.length(); i++) {
            int index = word.charAt(i) - 'a'; 
            if(curr.children[index] == null) { 
                curr.children[index] = new TrieNode(); 
            } 
            curr = curr.children[index]; 
        }
        curr.isEndOfWord = true; 
    }

    public boolean search(String word) { 
        TrieNode curr = this.findWord(word, 0, this.root); 
        return curr!=null && curr.isEndOfWord; 
    }

    public TrieNode findWord(String word, int index, TrieNode curr) {
        if(index == word.length() || curr == null) 
            return curr; 

        char ch = word.charAt(index); 
        if(ch == '.') { 
            for(int i=0; i<26; i++) { 
                TrieNode result = this.findWord(word, index +1, curr.children[i]); 
                if(result != null && result.isEndOfWord) { 
                    return result; 
                } 
            } 
            return null; 
        } 

        int j = ch - 'a'; 
        if(curr.children[j] != null) { 
            return this.findWord(word, index+1, curr.children[j]); 
        } 

        return null; 
    }
}
