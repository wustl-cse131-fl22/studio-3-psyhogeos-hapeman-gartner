package studio3;

import java.util.Scanner;

public class Sieve 
{

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	
	System.out.println("Through what number do you want to check the primes?");
	int n = in.nextInt();
	
	boolean[] primeness = new boolean[n-1];

		int[] array = new int[n-1];
		
		for (int i=0; i < array.length; i++)
		{
				array[i]=i+2;
		}
		System.out.println(primeness[0]);
		for (int i2 = 0; i2 < array.length; i2++)
		{
			if (primeness[i2]==false)
			{
				System.out.println(array[i2]);
				for (int i3 = 0; i3 < array.length; i3++)
				{
					if (array[i3]%array[i2]==0)
					{
						{
							primeness[i3] = true;
						}
					}
				}
			}
		}
		
			
			
	
	}

}
