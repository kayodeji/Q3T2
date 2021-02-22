public class Safiya {
    public static void main(String[] args) {// Mrs. Ayodeji had to add/move the main method here and add the code from 
        //class Main {
        double [][] randomNums = new double [6][5];
        double randomNum = Math.random() * 20;
        for (int i=0; i<randomNums.length; i++)
        {   for (int j=0; j<randomNums.length; j++)
           {    randomNums[i][j]=randomNum;}
        }
        String[] myStrings={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        // = new String [12];  // a year has 12 months not 11
 
        //myStrings = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
    public static int numOf(String[] arr, char c)
    {   int count = 0;
        for (String month : arr) //Mrs. Ayodeji= don't need int nor the [] since month is a String array 
        {   for (char i : month ) // month is a string so each piece is either a string or a char, not an int
            {   if (i == c)  //Mrs. Ayodeji: s is undeclared, do you mean c?
                {count++;}
            }
        }
        System.out.println(count);
    }
 
    public static void abbreviations(String[] arr)
    {   for (String month : arr)
        {   System.out.println(month.substring(month.length()-3));} // string length is a method not an attribute, need ()
        
 
    }
    public static void randomNums(double[][] arr, double val)
    {   for (int i=0; i<arr.length; i++)
        {   for (int j=0; j<arr.length; j++)
            {   if (arr[i][j]+val<20)
                {   arr[i][j]=arr[i][j]+val;}
            }
        }
    }
 
    public static void makeMiddleZero(double[][] arr)
    {   for (int i=0; i<arr.length; i++)
        {   for (int j=0; j<arr.length; j++)
            {   double z = charAt(i)/2;
                arr[z][j]=arr[0][j];}
        }
    }
}
