class Main {
    
    public static void main(String[] args){
    String[] myStrings = {"January", "February", "March", "April", "June", "July", "September", "October", "November", "December"};
    }

    public static int numOf(String arr[], char c)
    {
      int tracker = 0;
      for(int i = 0; i < arr.length; i++)
      {
        for(int j = 0; j < arr[i].length; j++)
        {
          if(arr[i].charAt(j) == c)
          {
            tracker++;
          }
        }
      }
      return tracker;
    }

    public static void abbreviations(String[] arr)
    {
      for(int i = 0; i < arr.length; i++)
      {
        arr[i] = arr[i].substring(arr[i].length - 3);
      }
    }
}