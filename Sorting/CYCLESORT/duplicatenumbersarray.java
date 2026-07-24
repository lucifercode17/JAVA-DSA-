package Sorting.CYCLESORT;

import java.util.ArrayList;
import java.util.List;

public class duplicatenumbersarray {
  public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    List<Integer> dup = dupicatenuber(arr);
    System.out.println(dup);
    
  }
  static List<Integer> dupicatenuber(int[] arr){
    int index =0;
    
    List<Integer> dup = new ArrayList<>();
    while(index < arr.length){
        int correct = arr[index]-1;
        if( arr[index] >0 && arr[index]<= arr.length && arr[correct] != arr[index]){
          int temp = arr[index];
          arr[index] = arr[correct];
          arr[correct] = temp;

      }else{
        index ++;
      }
    
  }
  for (int i = 0; i < arr.length; i++) {
      if (arr[i] != i + 1) {
        dup.add(arr[i]);
      }
    }
  return dup;

  

  }
}
