package QUESTIONS;

//  celiling of a number 
//celing = smallest element in arry greater than or equal to target  

public class sealingofnumber {
  public static void main(String[] args) {
    int[] arr ={2,3,4,6,12,14,16,18};
    int target = 13;
    int answer = ceilingnumber(arr, target);
    System.out.println(answer);
    int answer2 = flooringnumber(arr, target);
    System.out.println(answer2);
    
  }
  static int ceilingnumber(int[] arr,int target){
    int start = 0;
    int end = arr.length -1;

    while (start<=end) {
      int mid = start + ((end-start)/2);

      if(arr[mid] > target){
        end = mid -1;
      }else if (arr[mid]<target) {
        start = mid+1; 
      }else if(arr[mid]==target){
        return mid;
      }
      
    }
    return start;
  }

  // floor of a number 
  // flooring = greatest number which is smaller than equal to target number 
  static int flooringnumber(int[] arr,int target){
    int start = 0;
    int end = arr.length -1;

    while (start<=end) {
      int mid = start + ((end-start)/2);

      if(arr[mid] > target){
        end = mid -1;
      }else if (arr[mid]<target) {
        start = mid+1; 
      }else if(arr[mid]==target){
        return mid;
      }
      
    }
    return end;
  }
  
}
