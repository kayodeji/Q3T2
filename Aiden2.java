import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Aiden2 {
    
    public static void main(String[] args)  throws FileNotFoundException{
    String[] myStrings = {"January", "February", "March", "April", "June", "July", "September", "October", "November", "December"};
    // Code to Test 
		// Set up to write to file.
    String outputFileName ="Aiden2_q3t2results.txt";
    PrintWriter out = new PrintWriter(outputFileName);
  // Test #1
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
    public static int numOf(String arr[], char c)
    {
      int tracker = 0;
      for(int i = 0; i < arr.length; i++)
      {
        for(int j = 0; j < arr[i].length(); j++) // Mrs. Ayodeji added () to arr[i[.length]]
        {
          if(arr[i].charAt(j) == c)
          {
            tracker++;
          }
        }
      }
      return tracker;
    }

    public static void abbreviations(String[] arr)
    {
      for(int i = 0; i < arr.length; i++)
      {
        arr[i] = arr[i].substring(arr[i].length() - 3); // Mrs. Ayodeji added () to the end of length
      }
    }

}