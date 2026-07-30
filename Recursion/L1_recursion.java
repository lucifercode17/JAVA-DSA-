package Recursion;

//  here we unstand hoe to learn recursion 
// important 
// 1.while the func is not finshed excuting it will remains in the stack 
//2.when a function finishes excuting it is remooved from stack and the flow of prgram is returned to where funcation  was called 
// 3. In recusion we have to write a base condition which i used to break the the recrsion 
// 4.recusion is a function  which call it self 

// 5. if we donot give a function  base condition then then every fuction call gets the space and it will exceeed the space limit and give overflow error 
//6. we can create any recusion problem  to iteration problem and vice- versa 
// 7.the convertion of rcusion in iteration to do optimistion of the problem


public class L1_recursion {
  public static void main(String[] args) {
    // print(1);
    // System.out.println(fibonacci(20));
    int[] arr = {1,6,9,12,18,19,25};
    int target = 12;
    System.out.println(binary_search(arr, target, 0, arr.length));
    
  }
  // printing frist 5 number using recusion
  public static void print(int n){
    if(n==5){
      System.out.println(n);
      return;
    }
    System.out.print(n+" ");
    print(n+1);
  }  

  //  code of a fibonacci number 
  // the basic rule of the series the next number is the sum  of last to number 
  // the series looks like 0,1,1,2,3,5,-----

  // here is the code 
  public static int  fibonacci(int n){
    if(n==0|| n==1){
      return n;
    }
      
    return fibonacci(n-1) + fibonacci(n-2) ;
    
    
  }
  // binary search code with recursion 

  public static int binary_search(int[] nums, int target, int s, int e){
    if(s>e){
      return-1;
    }
    int mid = s + (e-s) /2;
    if(nums[mid] == target){
      return mid;
    }
    if (target<nums[mid]) {
      return binary_search(nums, target, s, e-1);
    }else{
      return binary_search(nums, target, s+1, e);
    }


  }
   
}
