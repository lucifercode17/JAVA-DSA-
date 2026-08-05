package MATHS;

public class mathsfordsa {
   public static void main(String[] args) {
     int n = 31;
     System.out.println(isPrime(n));
   }
   public static boolean isPrime(int n){
    if(n<=1){
      return false;
    }
    int i = 2;
    while (i*i <=n) {
      if(n%i == 0){
        return false;
      }
      i++;
      
    }
    return true;
   }

   
}
