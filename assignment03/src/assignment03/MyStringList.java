package assignment03;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList()
	{
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s)
	{ 
		if(size == strArray.length) 
		{
			this.resize();
		}  
		
		strArray[size] = s; 
		size++; 
	}
	
	public String get(int i)
	{
		if(i >= 0  && i < strArray.length) 
		{
			return strArray[i];
		}
		
		//implement
		return null;
	}
	
	public boolean find(String s)
	{
		int len =  strArray.length;
		
		for(int i =0; i < len; ++i) 
		{
			if(strArray[i].equals(s))
			{ 
				return true;
			}
		}
		 
		return false;
	}
	
	public void insert(String s, int pos)
	{
		if(size == strArray.length) 
		{
			this.resize();
		}  
		
		for(int i = 0; i < strArray.length; ++i) 
		{
			if(i == pos)
			{  
				for(int j = strArray.length - 1 ; j > pos ;j--) 
				{
					strArray[j] = strArray[j-1];
				}
				strArray[i] = s;
				
				size++;
				
				return;
			}
		}
		
	}
	
	public boolean remove(String s)
	{ 
		int len =  strArray.length;  
		  
		for(int i=0; i < len; ++i) 
		{
			if(s.equals(strArray[i]))
			{   
				for(int j = i ; j < len - 1; j++) 
				{
					strArray[j] = strArray[j+1];
				}
				
				this.size--;
				
				return true;
			}   
		} 
		
		//implement
		return false;
	} 
	
	private void resize()
	{
		int len = size() * 2; 
		
		String[] tmp = strArray; 
		
		strArray= new String[len];  
		System.arraycopy(tmp, 0, strArray, 0, tmp.length); 
	}
	
	public String toString()
	{
		String str="";
		for(String val:strArray) 
		{
			if(val != null ) 
			{
				str+=  val+ ", ";
			}
		} 
		
		str = str.substring(0, str.length()-2);
		
		return str;
	}
	
	public int size() 
	{ 
		return size;
	}

	public static void main(String[] args)
	{
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);	
	}

}
