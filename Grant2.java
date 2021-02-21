import java.util.*;
/* MCQ
1.d
2.d
3.a
**/
class Main {
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
}
  
  