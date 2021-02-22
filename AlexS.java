import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.math; //Unneccesary

public class AlexS {
  public static void main(String[] args) throws FileNotFoundException {
  //} unneccesary
  //String myStrings[] = new String[] { // declared a string either with a new keyword OR initializer list
    String[] myStrings = {
    "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    };
  //quesetion 2 starts here
  //double randomNums[] = new double[];{  // why? {} declared variable incorrectly, [] needs to be after double not variable name
  double[] randomNums = new double[6]; 
  for (int j = 0; j < randomNums.length; j++){ // Line 28: No ; needed at the end of a for statement
    randomNums[j] = 20*Math.random();
  }
  // Code to Test 
		// Set up to write to file.
    String outputFileName ="AlexS_q3t2results.txt";
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

  public static int numOf(String[] myStrings, char c){ // Mrs. Ayodeji removed the 3rd parameter and added it to the first line
    int counter = 0;
    for (int i = 0; i < myStrings.length; i++){
      if(myStrings[i].indexOf(c) != -1)
        {
            counter ++;     
        }
    }
    return counter;
  }
  /* This section couldnt compile, sorry for any errors */
  public static void abbreviations(String[] myStrings){ // Mrs. Ayodeji removed the 2nd parameter
    for (int i = 0; i < myStrings.length; i++){
      int l = myStrings[i].length() - 3; // Mrs. Ayodeji declared l to be an int, and added () the length;
      myStrings[i]=myStrings[i].substring(l); // Mrs. Ayodeji added the substring to the myStrings array

  }
}

}
