import java.io.*;

class GFG
{
	// similar to inner for loop
	public static void printRow(int n, int totalRows)
	{
		if(totalRows == 0)
		{
			return;
		}
		
		if(totalRows <= n) // condition when to print star
		{
			System.out.print(" *");
		}
		else // condition when to print space
		{
			System.out.print(" ");
		}
		printRow(n, totalRows - 1); // moving to next column recursively
	}
	
	// similar to outer for loop
	public static void newRow(int n, int totalRows)
	{
		if(n == 0)
		{
			return;
		}
	
		newRow(n - 1, totalRows);
		printRow(n, totalRows); // prints stars and space in a single row
		System.out.print("\n"); // for new Row.....new line
	}
	public static void main (String[] args)
	{
		GFG.newRow(5, 5); // newRow is static method so no need to create an object of GFG
	}
}
