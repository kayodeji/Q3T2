import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.util.*;
/* MCQ
1.d
2.d
3.a
**/
public class Grant2 {
  public static void main(String[] args)  throws FileNotFoundException {
  
   String[] myStrings = {"January","February","March","April","May","June", "July","August","September", "October", "November", "December"};
   double[][] randomNums= new double[6][5];
   
  for(int r=0;r<randomNums.length;r++)
  {
    for(int c=0;c<randomNums[r].length;c++)
    {
      randomNums[r][c]=Math.random()*20;
    }
  }
  // Code to Test 
		// Set up to write to file.
    String outputFileName ="grant_q3t2results.txt";
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
  //abbreviations(myStrings);
  //System.out.println(myStrings);
}

public static int numOf(String[] arr, char c){ // switched parameters
    int tot=0;
  for(String values:arr)
   {
     for(int i=0;i<values.length();i++)
     {
       if(values.charAt(i)==c)
       {tot++;}
     }
   }
   return tot;
  }

public static void abbreviations(String[] arr)
{
  for(int i=0;i<arr.length;i++)
  {
      arr[i]=arr[i].substring(arr[i].length()-3);
  }
}

public static void randomNums(double[][]arr, double val)
{
  for(int r=0;r<arr.length;r++)
  {
    for(int c=0;c<arr[r].length;c++)
    {
      if(arr[r][c]+val<=20)
      {
        arr[r][c]=arr[r][c]+val;
      }
    }
  }
}

public static void makeMiddleZero(double[][] arr)
{
  for(int i=0; i<arr.length;i++)
  {
    arr[i][2]=0;
  }
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