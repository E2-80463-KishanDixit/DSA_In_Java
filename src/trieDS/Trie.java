package trieDS;

public class Trie {
	
	private TrieNode root;
	Trie(){
		root = new TrieNode();
	}
	
	private class TrieNode{
		private TrieNode [] children;
		private boolean isEndWord;
		TrieNode(){
			children = new TrieNode[26];
			isEndWord = false;
		}
	}
	
	public  void insert(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(current.children[ch-'a']==null) {
				TrieNode node = new TrieNode();
				current.children[ch-'a'] = node;
				current = node;
			}else {
				current = current.children[ch-'a'];
			}
		}
		current.isEndWord = true;
	}
	
	public boolean search(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(current.children[ch-'a']==null) {
				return false;
			}else {
				current = current.children[ch-'a'];
			}
		}
		return current.isEndWord;
	}
	

	public static void main(String[] args) {
		String word[] = {"abc","abd","acde","abe","aeb","abba"};
		Trie tr = new Trie();
		
		for(String wrd : word) {
			tr.insert(wrd);
		}
		
		System.out.println(tr.search("ab"));
		
	}

}
