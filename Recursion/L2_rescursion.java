package Recursion;

public class L2_rescursion {
  public static void main(String[] args) {
    int n =5;
    // reversefun(n);
    // fun(n-1);
    // System.out.println(factroial(n));
    // System.out.println(sumOfDigits(1234));
    System.out.println(productOfDigit(1234));
  }
  static void fun(int n){
    if(n==0){
      return;
    }
    System.out.print(n + " ");
    fun(n-1);
  }
  static void reversefun(int n){
    if(n==0){
      return;
    }
    reversefun(n-1);
    System.out.print(n + " ");
  }

  // factroial of a number 

  static int factroial(int n){
    if(n==0 || n==1){
      return 1;
    }
    return n*factroial(n-1);
  }

  // sum of digit of a number 
  static int sumOfDigits(int number){
    if(number == 0){
      return 0;
    }


    return (number%10) + sumOfDigits(number/10);
  }

  // product of  digit of number 
  static int productOfDigit(int n){
    if(n%10 == n){
      return n;
    }
    return (n%10) * productOfDigit(n/10);
  }

  // palindrome number check

}
