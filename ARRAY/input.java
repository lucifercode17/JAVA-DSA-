package ARRAY;
import java.util.Scanner;

public class input {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int[] arr = new int[6];
  // one by one intialitions of the values in array 
  arr[0] =4;
  arr[1] =3;
  arr[2] =5;
  arr[3] =9;
  arr[4] =10;
  arr[5] =24;


  //  for taking input from the user 
  int[] arrinput = new int[5];
  for(int i =0; i<5;i++){
    arrinput[i] =in.nextInt();

  }

  // for printing use same loop 
  for(int i =0; i<5;i++){
    System.out.println(arrinput[i]);

  } 
  // for each loop 
  // -> it is use to access each element in the array one by one in a easy code 
  for (int num : arr) {
    System.out.println(num);
    
  }




  in.close();







  }

}
