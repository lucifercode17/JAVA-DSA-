package ARRAY;

public class linerseach {
  public static void main(String[] args) {
    int[] array ={45,6,7,3,67,0,23};
    int target = 3;
    int answer = linearsearch(array, target);
    System.out.println("index is " +answer);
     
  }

  // searching by liner search 
  static int linearsearch(int[] arr,int target){
    if (arr.length == 0){
      return -1;

    }
    // run for a loop for search  , we can also run a for each looop in this condition 
    for(int index =0; index<=arr.length;index++){
      int element = arr[index];
      if(element == target){
        return index;
      }
    }
    return -1;
  }
  
}
