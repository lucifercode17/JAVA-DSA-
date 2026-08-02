package MATHS;

// bit Manupilation 

//1. AND - Operator 
// where it is the rules are such that it works with 0,1 such if all value is true than true or 1  else 0;

// 2.xor 
// it gives true when the the value is complent 








public class bitwiseOperator {
  public static void main(String[] args) {
    // System.out.println(even(69));
    int[] arr = {2,3,5,2,6,3,5};
    System.out.println(find_the_unique_element(arr));
  }
  // find even or odd with bitwise operator 
  public static boolean even(int n){
    return (n & 1 ) != 1;

  }
  public static int find_the_unique_element(int[] arr){
    int unique = 0;
    for (int i : arr) {
      unique = unique^i;
    }
    return unique;
  }  
}
