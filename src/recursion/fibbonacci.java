package recursion;

public class fibbonacci 

{
static int printFibbonacci(int n)

{
	if (n==1 || n==2)
	return 1;
	else
	{
		return printFibbonacci(n-1) + printFibbonacci(n-2);
	}
}
	public static void main(String...s)
{
	System.out.println(printFibbonacci(8));
}
}
