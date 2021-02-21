class Main {
  public static void main(String[] args) {
String[] myStrings = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; //1A

double[][] randomNums;
for(int r=0; r<randomNums.length; r++){
  for(int c=0; c<randomNums[0].length; c++){
    randomNums[r][c] = 20*Math.random();//2a
  }
}
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
        arr[r][c] += arr[r][c] + val;
      }//2b
    }
  }

}

public static void makeMiddleZero(double[][] arr)
{
  int middleCol = ((arr[0].length-1)/2)+1; //assuming odd number
  for(int r=0; r<arr.length; r++){
    arr[r][middleCol] = 0;
  }//2c
}
}