package ARRAY;

public class introduction {
  public static void main(String[] args) {
    // stor a roll number
    int a = 15;
    // store a persons name
    String name = "dheeraj kushwaha";

    // store 5 roll number
    int rol = 23;
    int rno2 = 55;
    int rno3 = 18;

    // syntax for declaring a array
    // datatype[] variable_name = new datatype[size]
    int[] numbers = new int[5];
    // we can create a array also assign the value
    int[] numbers1 = { 4, 6, 78, 90, 15 };

    // how the array works
    int[] ros;// delcration of the array , ros is getting defined in the stack
    ros = new int[5]; // this is the insitaiion of the array the array get the actual space into the
                      // heap memmory , this is also called as dynamic memmory allocation

    // indexing in array
    // the element access in array is done by indexing
    System.out.println(ros[0]);// here the elemnet at 0 th index is accessed

    // new keyword -> it is a keyword which created an object

  }

}
