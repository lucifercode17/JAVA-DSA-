package ARRAY;

public class binarySearch {

  // binary search is a  optimised way of searching 
  // it cn only perform in a sort array format -> either ascending and desending 
  public static void main(String[] args) {
    int[] arr ={2,45,67,89,102,112};
    int target =67;
    boolean answer = search(arr, target);
    System.out.println(answer);
    
  }
  static boolean search (int[] arr, int target){
    if(arr.length == 0){
      return false;
    }
    int start = 0;
    int end = arr.length;
    while (start <= end) {
      int mid = start + ((end-start)/2);
      
      
      if(arr[start] > target){
        return false;
  
      }else if (arr[mid] > target) {
        end = mid -1;
      }else if (arr[mid]<target) {
        start = mid+1;
      }else if(arr[mid] == target){
        return true;
  
      }
    }

  return false;

    
  }
}
