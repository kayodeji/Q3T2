class Main {
public static void main(String[] args) {
    //a1
String[] myStrings = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    //b1
public static int numOf(String[] arr, char c)
{
int total = 0;
  for (String value: arr)
  {
    for (int i=0; i>value.length(); i++)
    {
      if (value.charAt(i)=c)
      {
       total++; 
      }
    }
  }
  return total;
}
  //c1
public static void abbreviations (String[] arr)
{
  for (String value: arr)
  {
    value = value.substring(value.length-3);
  }
}
  //a2
double randomNums[][] = new double [6][5];
for (int row = 0; row<randomNums.length; row++)
{
  for (int col = 0; col<randomNums[0].length; col++)
  {
    randomNums[row][col]=(Math.random()*20);
  }
}
  //b2
public static void randomNums (double[][] arr, double val)
{
  for (int row = 0; row<arr.length; row++)
  {
    for (int col = 0; col<arr[0].length; col++)
    {
      if ((arr[row][col])+val <= 20)
        {
          arr[row][col] = ((arr[row][col])+val);
        }
    }
  }
}
  //c2
public static void makeMiddleZero (double[][] arr)
{
  int half = (arr[0].length)/2;
  for (int row = 0; row<arr.length; row++)
  {
    arr[row][half] = 0;
  }
}
  }
}