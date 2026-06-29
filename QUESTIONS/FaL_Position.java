package QUESTIONS;

import java.util.Arrays;

public class FaL_Position {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,4,4,4,4,5,5,6,6};
    int target = 4;
    int ans[] =searchRange(nums, target);
    System.out.println(Arrays.toString(ans));
    
  
    
    
    
  }
  public static int[] searchRange(int[] nums, int target){
    int ans[] ={-1,-1};
    // check foer the frist occurance of target 
    int start = startAndEndPosition(nums, target, true);
    int end = startAndEndPosition(nums, target, false);
    ans[0] =start;
    ans[1] =end;
    return ans;
  }
  
  public static int startAndEndPosition(int[] nums, int target,boolean isfrist){
    int ans =-1;
    int start = 0;
    int end = nums.length -1;
    while (start <= end) {
      int mid = start + (end-start/2);


      if(target < nums[mid]){
        end =mid-1;

      }
      else if (target > nums[mid]) {
        start = mid +1;
        
      }else{
        ans =mid;

        if(isfrist){
          end =mid -1;

        }else{
          start = mid+1;
        }
      }
      
    }
    return ans;
  }  
}
