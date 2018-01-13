
public class Trie{
	static class TrieNode {
		TrieNode[] child = new TrieNode[26];
		boolean isWord;
		}
	TrieNode root;
	public Trie() {
		root = new TrieNode();
	}
	public void insert(String string) {
		TrieNode n = root;
		for(int i = 0; i<string.length(); i++) {
			char ch = string.charAt(i);
			if(n.child[ch-'a']==null) {
				n.child[ch-'a'] = new TrieNode();
			}
			n = n.child[ch-'a'];
		}
		n.isWord=true;
	}
	public boolean search(String string) {
		TrieNode n = root;
		for(int i = 0; i<string.length(); i++) {
			char ch = string.charAt(i);
			  if(n.child[ch - 'a'] == null) return false;
	            n = n.child[ch - 'a'];
	        }
	        return true;
	}
	public boolean startsWith(String prefix) {
		TrieNode n = root;
        for(int i = 0; i<prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(n.child[ch - 'a'] == null) return false;
            n = n.child[ch - 'a'];
        }
        return true;
		
	}
	
	
}
