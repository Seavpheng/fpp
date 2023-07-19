package prog5_1;

public class MySingleton {

	//add method
	public static MySingleton instance;
	
	private MySingleton() {
		
	} 
	
	public static MySingleton getInstance()
	{
		if(instance == null) 
		{
			instance = new MySingleton();
		}
		
		return instance;
	} 
}
