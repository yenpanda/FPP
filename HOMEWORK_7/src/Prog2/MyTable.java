package Prog2;


public class MyTable {
	private Entry[] entries;

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('c', "Charlie");
		System.out.println(t);

		String s = t.get('b');
		System.out.println(s);
	}
	
	MyTable() {
		this.entries = new Entry[26];
	}

	public String get(char c) {
		int i = (int) c - 97;  
		return entries[i].getString();
	}
	
	public void add(char c, String s) {
		int i = (int) c - 97;
		if (entries[i] == null) {
			Entry entry = new Entry(c, s);
			entries[i] = entry;
		}
	}

	public class Entry {
		private char c;
		private String str;

		Entry(char c, String str) {
			this.c = c;
			this.str = str;
		}
		public String toString() {
			return (getChar() + "-->" + getString());
		}

		public char getChar() {
			return c;
		}

		public String getString() {
			return str;
		}

	}
	
	public String toString() {
		String s = new String();
		for (Entry entry : entries) {
			if (entry != null) {
				s += entry.getChar() + "-->" + entry.getString() + "\n" ;
			}
		}
		return s;
	}

}