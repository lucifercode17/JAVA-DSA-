package Sorting.CYCLESORT;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

public class findinsetmismatch {
  public static void main(String[] args) {
    int[] nums ={1,2,2,4};
    int[] set = missmatch(nums);
    System.out.println(Arrays.toString(set));
    
  }
  static int[] missmatch(int[] arr){
     int index =0;
    
    while(index < arr.length){
      int correct = arr[index]-1;
      if(arr[index] >0 &&arr[index]<= arr.length && arr[correct] != arr[index]){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;


      }else{
        index++;
      }



    }
    // search the missing number 
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] != i+1){
        return new int[] {arr[i], i+1};
      }

      
    }
    return new int[] {-1,-1};

  }
}

