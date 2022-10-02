package prog8_5;

public class MyTable {
	private Entry[] entries;
	
	MyTable(){
		entries = new Entry[26];
	}
	
	//returns the String that is matched with char c in the table
	public String get(char c)
	{  
		for(Entry e : entries) {
			 if(e != null && e.key == c) {
				 return e.value;
			 }
		} 
		
		return null; 
	}
	
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) { 
		Entry e = new Entry(s, c);   
		char a = 'a';
		int i = c - a ; 
		
		entries[i] = e;
	}
	
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() 
	{ 
		String result = "";
		for(Entry e : entries) {
			if(e != null)
				result += e.toString();
		}
		
		return result ;
	}
	
	
	private class Entry {
		private String value;
		private char key;
		
		Entry(String str, char ch){
			value = str;
			key = ch;
		}
		//returns a String of the form "ch->str" 
		public String toString() 
		{  
			return String.valueOf(key) + "->" + value + "\r\n";
		}
	}
	
	public static void main(String [] args) 
	{ 
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy" );
		t.add('w', "Willie");
		t.add('e', "Eminen"); 
		t.add('f', "Faniny"); 
		 
		System.out.print(t); 
	}

}