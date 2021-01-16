package arrayInterviewQuestion;

import java.util.Arrays;

public class UniqueCharacter 
{
	
	
	static  public boolean stringChecker(String test) 
	{
		char a[]=test.toCharArray();
		
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
					return false;
			}
			
		}
		return true;
	}
	
public static void main(String...s)
{
//determine a string that has all the unique characters,without using any additional data structure
	String test="abeecdefghia";
	
	// yes no ans then it means boolean return;
	System.out.println(stringChecker(test));
}
}
