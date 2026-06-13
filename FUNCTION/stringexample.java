import java.util.Scanner;

public class stringexample {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = greet();// function with string return type 
    System.out.println(str);
    String name = in.nextLine();
    String str1 =greet(name);// function call with argument , we can hve multiple agument seprated with comma 
    System.out.println(str1);

    in.close();

  }
  static String greet(String name) {
    String str = "hello master coder  "+name;
    return str;
  }
  static String greet(){
    String str = "hello master coder ";
    return str;
  }
}
