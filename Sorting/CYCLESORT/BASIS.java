package Sorting.CYCLESORT;
// when the range is given 1 to n  use cyclic sort 

import java.util.Arrays;

public class BASIS {
  public static void main(String[] args) {
    int[] arr ={4,3,2,1,5};
    sort(arr);
    System.out.println(Arrays.toString(arr));
    
  }
  static void sort(int[] arr){
    int index =0;
    
    while(index < arr.length){
      int correct = arr[index]-1;
      if(correct != index){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;


      }else{
        index++;
      }


    }
  }
  
}
