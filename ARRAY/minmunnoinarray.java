package ARRAY;

public class minmunnoinarray {
  public static void main(String[] args) {
    int[] arr = {3,5,23,67,1,56};
    int answer = minnumner(arr);
    System.out.println(answer);
    
  }
  static int minnumner(int[] arr){
    int min = Integer.MAX_VALUE;
    for(int element : arr){
      if(element < min){
        min = element;
      }
    }

    return min;
    }
}
