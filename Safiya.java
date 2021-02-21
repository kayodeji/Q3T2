class Main {
 
String [] myStrings = new String [11];
 
myStrings = new String[]{January, February, March, April, May, June, July, August, September, October, November, December};
 
public static int numOf(String[] arr, char c)
{int count = 0;
for (int[] month : arr)
{for (int i : month )
{if (i == s)
{count++;}
}
}
System.out.println(count);
}
 
public static void abbreviations(String[] arr)
{for (String month : arr)
{System.out.println(month.substring(month.length-3));}
}
 
 }















class Main {
 double [][] randomNums = new double [6][5];
 double randomNum = Math.random() * 20;
for (int i=0; i<randomNums.length; i++)
{for (int j=0; j<randomNums.length; j++)
{randomNums[i][j]=randomNum;}
}
 
public static void randomNums(double[][] arr, double val)
{for (int i=0; i<arr.length; i++)
{for (int j=0; j<arr.length; j++)
{if (arr[i][j]+val<20)
{arr[i][j]=arr[i][j]+val;}}
}}
 
public static void makeMiddleZero(double[][] arr)
{for (int i=0; i<arr.length; i++)
{for (int j=0; j<arr.length; j++)
{double z = charAt(i)/2;
arr[z][j]=arr[0][j];}
}
}
}

