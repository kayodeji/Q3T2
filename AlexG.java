import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AlexG {
  public static void main(String[] args) throws FileNotFoundException{
String[] myStrings = {"January", "February", "March", "April", "May", "June",
"July", "August", "September", "October", "November", "December"}; // Mrs. Ayodeji had to add the full months

//{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; //1A

double[][] randomNums = new double[6][5]; //Mrs. Ayodeji added new double[6][5]
for(int r=0; r<randomNums.length; r++){
  for(int c=0; c<randomNums[0].length; c++){
    randomNums[r][c] = 20*Math.random();//2a
  }
}
  // Code to Test 
		// Set up to write to file.
    String outputFileName ="AlexG_q3t2results.txt";
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
//Test #2
out.println("\n\n#2 Random 6 x 5 array");
print2D(randomNums);
double s1 = sum2D(randomNums);
int numMoreThan20_1 = moreThan(randomNums, 20);
out.println("randomNums has " + numMoreThan20_1 + " numbers greater than 20");
randomNums(randomNums, 4);
double s2 = sum2D(randomNums);
int numMoreThan20_2 = moreThan(randomNums, 20);
out.println("After adding 4, randomNums has " + numMoreThan20_2 + " numbers greater than 20");
out.println("The sum before adding 4 was " + s1 + ", and now it is " + s2);
out.println("\n\n Middle Column values before:");
for (int r = 0; r< randomNums.length; r++)
{
  int colLength = randomNums[r].length;
  if (colLength % 2 == 1)
  {
    out.print(randomNums[r][colLength/2] + ", "); 
  }	
}
makeMiddleZero(randomNums);
out.println("\n\n Middle Column values after:");
for (int r = 0; r< randomNums.length; r++)
{
  int colLength = randomNums[r].length;
  if (colLength % 2 == 1)
  {
    out.print(randomNums[r][colLength/2] + ", "); 
  }	
}
out.close();

}

  public static int numOf(String[] arr, char c)
{ 
  int counter = 0;
  boolean isFound = false;
  for(int i=0; i<arr.length; i++){
    if(arr[i].substring(0).equals(c)){
      isFound = true;
      counter++;
    }//1b
  }
  return counter;

  
}

public static void abbreviations(String[] arr)
{
  for(int i=0; i<arr.length; i++){
    arr[i] = arr[i].substring(arr[i].length()-3);
  }//1c
}

public static void randomNums(double[][] arr, double val)
{
  for(int r=0; r<arr.length; r++){
    for(int c=0; c<arr[0].length; c++){
      if(arr[r][c] + val < 20.0){
        arr[r][c] = arr[r][c] + val; // Mrs Ayodeji had to remove the + from +=
      }//2b
    }
  }

}

public static void makeMiddleZero(double[][] arr)
{
  int middleCol = ((arr[0].length-1)/2); //assuming odd number Mrs. Ayodeji had to remove the +1 at the end
  for(int r=0; r<arr.length; r++){
    arr[r][middleCol] = 0;
  }//2c
}
	// Helper Methods
	public static void print2D(double[][] arr)
	{
		for (int r = 0; r< arr.length; r++)
		{
			for (int c = 0; c < arr[r].length; c++)
			{
				if (c == arr[r].length-1)
				{
					System.out.printf("%.2f\n", arr[r][c]);
					//System.out.println("");
				}
				else
				{
					System.out.printf("%.2f", arr[r][c]); 
					System.out.print( ", ");
				}
			}
		}
		System.out.println("\n\n");
	}

	public static int moreThan(double[][] arr, double val)
	{
		int ctr = 0;
		for (int r=0; r < arr.length; r++)
		{
			for (int c = 0; c < arr[r].length; c++)
			{
				if (arr[r][c]>val)
				{	ctr++;	}
			}
		}
		return ctr;
	}

	public static double sum2D(double[][] arr)
	{
		double thesum = 0;
		for (int r=0; r < arr.length; r++)
		{
			for (int c = 0; c < arr[r].length; c++)
			{
				thesum = thesum + arr[r][c];
			}
		}
		return thesum;
	}
}