package ARRAY.Recursion;

import java.util.ArrayList;

public class sortedArray {
public static void main(String[] args) {
  int[] arr = {2,3,4,6,8,8,9};
  // System.out.println(isSorted(arr, 0));
  int target = 8;
  
  allOccuranceLinearSearch(arr, target, 0);
  System.out.println(list);



  }

  // checking sorted with recursion 
  public static boolean isSorted(int[] arr ,int index){
    if(index == arr.length -1){
      return true;
    }
    return arr[index] < arr[index +1] && isSorted(arr, index +1);
  }


  // doing linear search by recursion
  public static int linearSearch(int[] arr , int target , int index){
    if(index == arr.length-1){
      return -1;
    }
    if(arr[index] == target){
      return index;
    }
    return linearSearch(arr, target, index+1);
    


  } 

  // for find all occourance 
  static ArrayList<Integer> list = new ArrayList<>();
  public static void allOccuranceLinearSearch(int[] arr , int target , int index){
    if(index == arr.length){
      return;
    }
    if(arr[index] == target){
      list.add(index);
      allOccuranceLinearSearch(arr, target, index+1);

    }
    else{
      allOccuranceLinearSearch(arr, target, index+1);
    }
    
  } 
  
}
