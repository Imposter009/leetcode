class Trie {
    class TrieNode{
          boolean eow;
          TrieNode [] children =new TrieNode[26];
        public TrieNode(){
          for(int i=0;i<26;i++)
          {
            children[i]=null;
          }
        }
    }
    public static TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    public void insert(String word) {
        int l=word.length();
        int level=0;
        TrieNode curr=root;
        for(level=0;level<l;level++)
        {
            int ind=word.charAt(level)-'a';
            if(curr.children[ind]==null) curr.children[ind]=new TrieNode();
        curr=curr.children[ind];
        }
        curr.eow=true;
    }
    
    public boolean search(String word) {
        int level=0;
        int l=word.length();
        int ind=0;
        TrieNode curr=root;
        for(level=0;level<l;level++)
        {
            ind=word.charAt(level)-'a';
            if(curr.children[ind]==null) return false;
            curr=curr.children[ind];        
        }
        return curr.eow==true;
    }
    
    public boolean startsWith(String prefix) {
        int level=0;
        int l=prefix.length();
        int ind=0;
        TrieNode curr=root;
        for(level=0;level<l;level++)
        {
              ind=prefix.charAt(level)-'a';
            if(curr.children[ind]==null) return false;
            curr=curr.children[ind];        
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */