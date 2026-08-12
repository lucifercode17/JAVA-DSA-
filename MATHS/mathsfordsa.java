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
   

  //  all the prime number till number  n 

  //  static void sieve(int n , boolean[] primes){
  //   for(int i =2 ; i*i <=n; i++ ){
  //     if(!primes[i]){
  //       for(int j = i*2)
  //     }
  //   }
  //  }
   


  // finding Square root of a number  using binary search 
  // static double sqrt(int n,int p){
  //   int s =0;
  //   int e = n;
  //   double root = 0.0;
  //   while(s <= e){
  //     int m = s + (e-s)/2;

  //     if(m*m == n){
  //       return m;

  //     }
  //     if(m*m > n){
  //       e = m-1;
  //     }

  //   }
  //   return root;
  // }

  

}
