package inheritance;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern");
		
		int rows = scanner.nextInt();
		System.out.println("**Printing the Pattern...**");
			
			// demo
			for(int i=rows;i>=1;i--) 
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			// demo1
			for(int i=1;i<=rows;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			for(int i=rows;i>=1;i--)
			{
				for(int j=rows;j>=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
	  }

}
