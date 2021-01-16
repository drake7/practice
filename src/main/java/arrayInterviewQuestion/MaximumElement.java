package arrayInterviewQuestion;

public class MaximumElement 
{
	public static void main(String... s)
	{
	int[] array= new int[]{1000,2,-4,126,5,126,21,145,123,170};
	int largestElement=array[0];
	for(int i=1;i<array.length;i++)
	{
		if(largestElement<array[i])
		{
			largestElement=array[i];

			System.out.println("Comparison:"+i+"="+largestElement);
		}
		
	}
	System.out.println(largestElement);
	}
}
