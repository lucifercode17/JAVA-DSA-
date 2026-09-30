package String;



// subset question  

// subset -> non -adjanent collection 


public class subSequance {

  public static void main(String[] args) {
    subsets("", "abc");
    
  }

  static  void subsets(String subset ,String sequance ){
    if(sequance.isEmpty()){
      System.out.println(subset);
      return ;
    }
    char ch = sequance.charAt(0);
    subsets(subset, sequance.substring(1));
    subsets(subset+ch, sequance.substring(1));


  }
  
}
