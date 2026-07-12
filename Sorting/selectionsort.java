package Sorting;

import java.util.Arrays;

// it is a sorting algo in which the  the element is selected and sorted to the correct index 

public class selectionsort {
  public static void main(String[] args) {
    // find the max item in remaining array and swap with corret index 
    int[] arr = {4,3,7,9,2,4,0};
    selecton(arr);
    System.out.println(Arrays.toString(arr));

    
  }
  static void selecton(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      int last = arr.length -i-1;
      int maxindex = getmaxindex(arr, 0, last);
      swap(arr,maxindex,last);
    }
  }



  static int getmaxindex(int[] arr, int start, int end){
    int max = start;
    for(int i = start; i<= end;i++){
      if(arr[max]<arr[i]){
        max =i;
      }
    }
    return max;
  }

  static void swap(int[] arr, int frist, int second){
    int temp =arr[frist];
    arr[frist] = arr[second];
    arr[second] =temp;
  }
  
}
