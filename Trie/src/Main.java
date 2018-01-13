
public class Main {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("boat");
		System.out.println(t.search("bore"));
		System.out.println(t.search("boat"));
		t.startsWith("b");
	}

}
