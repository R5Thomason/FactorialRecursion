package recursion.controller;

public class FactRecursion
{
	private int factorial(int currentNumber)
	{
		int factValue = 0;
		if(currentNumber >= 0)
		{
			if(currentNumber <=1)
			{
				return 1;
			}
			else
			{
				return currentNumber * factorial(currentNumber - 1);
			}
		}
		
		return factValue;
	}
	
	public void start()
	{
		for (int count = 0; count < 17; count ++)
		{
			System.out.println(factorial(count));
		}
		
		System.out.println(factorial(5));
	}
}
