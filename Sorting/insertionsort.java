package Sorting;

import java.util.Arrays;

public class insertionsort {
  public static void main(String[] args) {
    int[] arr = {4,3,7,9,2,4,0};
    sort(arr);
    System.out.println(Arrays.toString(arr));
    
  }
  static void sort(int[] arr){
    for(int i =0; i< arr.length -1;i++){
      for(int j =i+1; j>0;j--){
        if(arr[j] < arr[j-1]){
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] =temp;

        }
      }
    
    }
  }
  
}

