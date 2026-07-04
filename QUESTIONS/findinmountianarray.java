package QUESTIONS;

public class findinmountianarray {
  // in this are the array is arranged in such order sorted frist in incresing  and the decreasing form  it doesnot conatain dubicate contious manner  element 

  // example  {1,2,4,6,8,5,4,3,2}
  // in this question we have to find the peak if the array which the higest element of the array 

  // the llop should break when start and end point to the lagreest number 

  public static void main(String[] args) {
    int[] arr = {1,2,4,5,7,9,8,7,4,2};
    int target = 8;
    int ans = search(arr, target);
    System.out.println(ans);
    
    
    
    
  }
  public static int search(int[] arr, int target){
    int peak = indexpeakofmaontainarray(arr);
    int fristpart = findtargetbeforpeak(arr, 0, peak, target);
    if(fristpart != -1 ){
      return fristpart;
    }else{
      int secondpart = findtargetafterpeak(arr, peak+1, arr.length-1, target);
      return secondpart;
    }
  }
  public static int findtargetbeforpeak(int[] arr,int start,int end , int target){
    
    while (start<end) {
       int mid = start + ((end-start)/2);
      
      
      
  
      if (arr[mid] > target) {
        end = mid -1;
      }else if (arr[mid]<target) {
        start = mid+1;
      }else{
        return mid;
  
      }
      
    }
    return -1;


  }
  public static int findtargetafterpeak(int[] arr,int start,int end , int target){
    
    while (start <= end) {
       int mid = start + ((end-start)/2);
      
      
      
  
      if (arr[mid] < target) {
        end = mid -1;
      }else if (arr[mid] > target) {
        start = mid+1;
      }else{
        return mid;
  
      }
      
    }
    return -1;


  }
  public static int indexpeakofmaontainarray(int[] arr){
    int start =0;
    int end = arr.length -1;
    while (start <end) {
      int mid = start +(end -start)/2;
      if(arr[mid] > arr[mid +1]){
        // you are in dec part of array 
        // this may bre the answer , but look for the left hand side of the mid 
        end = mid;
      }else{
        // you are in acesding part of the array 
        start = mid+1;// because we know that mid  +1 element >mid element 

      }
      
    }
    // in the end , start == end the lagerest element is pointed  because of 2 checks above 
    return start;




  }
}
