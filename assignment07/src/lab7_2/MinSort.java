package lab7_2;

 

public class MinSort 
{
 
	char[] arr;  
	public void sort(String str){
		arr = str.toCharArray();
		
		int len = arr.length;
		for(int i = 0; i < len ; ++i) {
			 int nextMinPos = minpos(i, len); 
			 swap(i, nextMinPos);
		}
	}
	
	public int minpos(int i, int j) 
	{
		int pos = i;
		char min = arr[i];
		for(int k=i+1; k<j; k++) {
			if(arr[k] < min) {
				pos = k;
				min = arr[k];
			}
		}
		return pos;
	}
	
	public void swap(int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void main(String [] args)
	{
		MinSort ms = new MinSort();
		ms.sort("zwxuabfkafutbbbb");
		 
		System.out.print(ms.arr);  
	}

}
