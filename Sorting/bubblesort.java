package Sorting;

import java.util.Arrays;

// it is the sorting techniques ,in which it comapre the adjec - element 
// with the frist pass througth the array , the largest element to the end 
// with pass two throught the array we get the 2nd largest element cone to the second last 
// same  goes for all pass 
// this is also known as sniking sort and exchange sort 
// the time coplexity = o(n^2)

// stable and unstable sorting 

// the buble sort is a stable sorting 
// which means the order of the aray is maintained after the performing the sorting , such that there a dublicate element are occuring the the odoer is maintained after sorting 
public class bubblesort {
  public static void main(String[] args) {
    int[] arr = {3,2,6,7,1,9,2,7,8};
    sort(arr);
    System.out.println(Arrays.toString(arr));
    
  }
  static void sort(int[] arr){
    for(int i =0; i< arr.length; i++ ){
      // for each stepl max element goes to the end 
      for(int j =1;j < arr.length -i;j++){
        if(arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
      }
    }
  }
   
  
}
