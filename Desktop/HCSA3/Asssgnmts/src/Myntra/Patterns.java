package Myntra;

public class Patterns {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		int n=5;
		for (i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				{
				System.out.print("*");
				}
			System.out.println("");
		}
		//pattern 2//
		for (i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				{
				System.out.print("*");
				}
			System.out.println("");
		}
		//pattern 3
		for (i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				{
				System.out.print("*");
				}
			System.out.println("");
		}
		//pattern 4//
		for (i=1;i<=n;i++)
		{
			for(k=1;k<i;k++) {
				System.out.print(" ");
			}
			
			for(j=i;j<=n;j++)
				{
				System.out.print("*");
				}
			
			System.out.println("");
		}
		//pattern 5//
		for (i=1;i<=n;i++)
		{
			for(k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
				{
				System.out.print("*");
				}
			System.out.println("");
		}
		//pattern 6//
		
	}
	
	}

	
