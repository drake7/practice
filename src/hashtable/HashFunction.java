package hashtable;

import java.util.Arrays;

public class HashFunction {

	String[] array;
	int size;
	int itemsInArray=0;
	public static void main(String arg[])
	{
		
		
	}
	
	HashFunction(int size)
	{
		this.size=size;
		array=new String[size];
		Arrays.fill(array, "-1");
		
	}
}
