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
public class main {
  public static void main(String[] args) {
  
   String[] myStrings = {"January","February","March","April","May","June", "July","August","September", "October", "November", "December"};
   double[][] randomNums= new double[6][5];
   
  for(int r=0;r<randomNums.length;r++)
  {
    for(int c=0;c<randomNums[r].length;c++)
    {
      randomNums[r][c]=Math.random()*20;
    }
  }
  abbreviations(myStrings);
  System.out.println(myStrings);
}

public static int numOf(char c, String[] arr){
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