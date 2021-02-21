class Main {
  // #1 a
  public static void main(String[] args) {
    String[] myStrings = {"Jan" , "Feb" , "Mar" , "Apr" , "May" , "June" , "July" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"};
  }
// #1 b
  public static int numOf(String[] arr, char c)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i].charAt(i) == c)
        {
             count++;
        }
    }
    return count;
  }
 // #1 c 
  public static void abbreviations(String[] arr)
  {
   for (int i = 0; i < arr.length; i ++)
   {
     arr[i] = arr[i].substring(arr[i].length() - 3);
   } 
  }
}
//#2 
class Main {
  public static void main(String[] args) {
    double[][] randomNums = new double[6][5];
    for (int i = 0; i < randomNums.length; i++) {
        for (int j = 0; j < randomNums[i].length; j++) {
            randomNums[i][j] = (int)(Math.random() * (20 - 0) + 0);
        }
    }
  }

  public static void randomNums(double[][] arr, double val)
  {
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < arr[i].length; j++)
      {
        if (arr[i][j] + val <= 20)
        {
          arr[i][j] = arr[i][j] + val;
        }
      }
    }
  }

  public static void makeMiddleZero(double[][] arr)
  {
    int middleNum1 = (int) arr[0].length / 2;
    int middleNum2 = middleNum1 + 1;

    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < arr[i].length; j++)
      {
        if (j == middleNum1 || j == middleNum2)
        {
          arr[i][j] = 0;
        }
      }
    }
  }
}