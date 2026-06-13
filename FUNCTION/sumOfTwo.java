
import java.util.Scanner;
public class sumOfTwo {
  public static void main(String[] args){

    // Scanner in = new Scanner(System.in);
    // System.out.println(("enter the frist number:"));
    // int num1 = in.nextInt();
    // System.out.println(("enter the second  number:"));
    // int num2 = in.nextInt();
    // int sum = num1+num2;
    // System.out.println(sum);

    // in.close();

    // this is a raw code for writting any program , waht if we required the program multiple time in the application we can robust it it will time cunsuming and waste of space so we have to make this in a fuction which is also called method in java  
    
    // call of functuon in the main class because the main class is the frist class which run in the program 
    sum();
    // the fuction with return type is call in a refernce variable 
    int result = sum2();
    System.out.println(result);
    Scanner in = new Scanner(System.in);
    System.out.println("enter the frist number ");
    int a=in.nextInt();
    System.out.println("enter the second number ");
    int b = in.nextInt();


    int result1 = sum3(a,b);
    System.out.println(result1);
    in.close();
    
    



  }
  

  // determing a java function or method 
  static void sum(){ // here void is one of return type when we dont have to retun any value by a funtion 
    Scanner in = new Scanner(System.in);
    System.out.println(("enter the frist number:"));
    int num1 = in.nextInt();
    System.out.println(("enter the second  number:"));
    int num2 = in.nextInt();
    int sum = num1+num2;
    System.out.println(sum);

    
    
  }

  // there are different type return type used to write the function which is decided by the return vallue we need 

  // example 
  static int sum2(){
    Scanner in = new Scanner(System.in);
    System.out.println(("enter the frist number:"));
    int num1 = in.nextInt();
    System.out.println(("enter the second  number:"));
    int num2 = in.nextInt();
    int sum = num1+num2;
    in.close();
    return sum;// here the value which is calculated to in this fuction is return  , the return statement mean that the function is terminated here
  }


  // we can give the variable value in the function it self so we dont have to take input inside the function  we  dont have to call scanner class and close it 

  // deteriming the the function with parameters 
  static int sum3(int a, int b){
    int sum = a+b;
    return sum;
  }

  
}


