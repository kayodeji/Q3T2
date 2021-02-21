import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ayodeje
{

	public static void main(String[] args) throws FileNotFoundException
	{
		String[] myStrings = {"January", "February", "March", "April", "May", "June",
								"July", "August", "September", "October", "November", "December"};
		
		// Code to Test 
		// Set up to write to file.
        String outputFileName ="solution_q3t2results.txt";
        PrintWriter out = new PrintWriter(outputFileName);
		for (int i = 0; i< myStrings.length;i++)
		{
			if (i==5)
			{	out.println(myStrings[i]+",");}
			else
			{	out.print(myStrings[i]+",");}
		}
		out.println("\n\nResult of numOf(J):");
		out.println(numOf(myStrings, 'J'));
		out.println("\nResult of abbreviations");
		String[] copyMyStrings = myStrings.clone();
		abbreviations(myStrings);
		for (int i = 0; i< myStrings.length;i++)
		{
			out.print(myStrings[i]+",");
		}
		out.close();
	}

	public static int numOf(String[] arr, char c)
	{
		int count = 0;
		for (int i=0; i< arr.length; i++)
		{
			if (arr[i].indexOf(c)>-1)
			{
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public static void abbreviations(String[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			int stringLength = arr[i].length();
			if (stringLength>3)
			{
				String s = arr[i].substring(stringLength-3);
				arr[i]=s;
			}
		}
	}
}