package Recursion.Pattern;

public class recursion_pattern {
  public static void main(String[] args) {
    Pattern(4, 0);
    
  }

  //  print 
  // * * * *
  // * * *
  // * *
  // * 

  static void Pattern(int row, int column){
    if(row == 0){
      return;
    }
    if(column < row){
      System.out.print("*");
      Pattern(row, column+1);
    }else{
      System.out.println();
      Pattern(row-1,0);

    }
  }
}
