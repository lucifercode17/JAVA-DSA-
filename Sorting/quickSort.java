package Sorting;

import java.util.Arrays;

// quick sort is unstable sort 

// it is better in array than merge sort
// but in linked list the merge is better because it doesnot have conttinous memory allocation 

// hybrid sorting is the mixture of merge sort and interstion sort because inteerstion sort is work more effcient in sub sort array

public class quickSort {
  public static void main(String[] args) {
    int[] nums ={2,5,23,5,21,45,4,7};
    sort(nums, 0, nums.length-1);
    System.out.println(Arrays.toString(nums));
  }


  static void sort(int[] nums, int low, int hi){
    if(low >=hi){
      return;
    }

    int s = low;
    int e = hi;
    int m = s +(e-s)/2;
    int poivt = nums[m];


    while (s <= e) {

      while (nums[s] <poivt) {
        s++;
        
      }
      while (nums[e] > poivt) {
        e--;

        
      }
      if(s <=e){
        int temp = nums[e];
        nums[e]= nums[s];
        nums[s] = temp;
        s++;
        e--;
      }
      
    }
    sort(nums, low,e);
    sort(nums, s, hi);
  }
  
}
