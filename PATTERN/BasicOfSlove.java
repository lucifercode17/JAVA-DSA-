package PATTERN;

// how to apporach the problem ,  the other loop is responsible for rows and the inner loop is responsible for columns 
// no of lines = no of row 
// no of times = no of columns 


public class BasicOfSlove {

  public static void main(String[] args) {
    int n= 5;
    // patternOne(n);
    // patternTwo(n);
    // patternThree(n);
    // patternFour(n);
    patternFive(n);
    
    
  }
  public static void patternOne(int n){
    for(int i=0;i<n;i++){
      for(int j=n-i;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }
    // *
    // **
    // ***
    // ****
    // *****

  // ----------------------------------------------------------

  public static void patternTwo(int n){
    for(int i=0; i < n;i++){
      for(int j = 0; j < n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
    //output 
    // *****
    // *****
    // *****
    // *****
    // *****
  

  public static void patternThree(int n){
      for(int i=0;i<n;i++){
      for(int j = i+1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();

    }

  }

  // output 
    // *****
    // ****
    // ***
    // **
    // *

    public static void patternFour(int n){
      for(int i=1;i<=n;i++){
        for(int j = 0; j<i;j++){
          System.out.print(j+1 +" ");
        }
        System.out.println();
      }
    }
    // output 
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 



  // public static void patternFive(int n){
  //   for(int i=0; i<2*n; i++){
  //     if(i<n){

  //       for(int j=n-i;j<=n;j++){
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }else{
  //       for(int j =0;j<(2*n-i-1);j++){
  //       System.out.print("*");
  //       }
  //     }

  //   }

      
  }


}
