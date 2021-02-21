import java.math;

class Main {
  public static void main(String[] args) {
  }
  String myStrings[] = new String[] {
    "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
  };
  public static int numOf(String[] myStrings, char c, int counter){
    for (int i = 0; i < myStrings.length; i++){
      if(myStrings[i].indexOf(c) != -1)
        {
            counter ++;     
        }
    }
    return counter;
  }
  /* This section couldnt compile, sorry for any errors
  public static void abbreviations(String[] myStrings, int l){
    for (int i = 0; i < myStrings.length; i++){
      l = myStrings[i].length - 3;
      myStrings[i].substring(l);

  }
}*/
//quesetion 2 starts here
double randomNums[] = new double[]{
  for (int j = 0; j < randomNums.length; j++);{
    randomNums[j] = 20*Math.random();
  }
}
}
