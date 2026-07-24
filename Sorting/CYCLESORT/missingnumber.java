package Sorting.CYCLESORT;

public class missingnumber {
  public static void main(String[] args) {
    int[] arr = {4,0,2,1};
    int ans = missingNumber(arr);
    System.out.println(ans);
    
  }
  // the range  is [0,n]
  static int missingNumber(int[] arr){
    int index =0;
    
    while(index < arr.length){
      int correct = arr[index];
      if( arr[index]< arr.length && arr[correct] != arr[index]){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;


      }else{
        index++;
      }



    }
    // search the missing number 
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] != i){
        return i;
      }

      
    }
    return arr.length;
  

  }
  
}
