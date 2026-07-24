package Sorting.CYCLESORT;

public class duplicatenumber {
  public static void main(String[] args) {
    int[] arr = {1,4,2,4,3};
    int ans = duplicate(arr);
    System.out.println(ans);
    
  }
  static int duplicate(int[] arr){
    int index =0;
    
    while(index < arr.length){
      if(arr[index] != index+1){
        int correct = arr[index]-1;
        if( arr[index] >0 && arr[index]<= arr.length && arr[correct] != arr[index]){
          int temp = arr[index];
          arr[index] = arr[correct];
          arr[correct] = temp;

      }else{
        return arr[index];
      }
    } else{
        index++;
    }
  }

  
  return -1;
}
}

