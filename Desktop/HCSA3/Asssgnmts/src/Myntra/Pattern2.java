package Myntra;

public class Pattern2 {

	public static void main(String[] args) {
		//pattern6//
		int i,j,k;
		int n=5;
		for(i=1;i<=n;i++) {
			for(k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//pattern 7//
		for(i=n;i>=1;i--) {
			for(k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//pattern8//
		for(i=1;i<=n;i++) {
			for(k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(i=n;i>=1;i--) {
			for(k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
