package QUESTIONS;

public class ceilingofletters {
  public static void main(String[] args) {
    char[] str = {'e','f','g'};
    char target = 'f';
    char answer = smallestletter(str, target);
    System.out.println(answer);
    
    
  }
  static  char smallestletter(char[] str,char target){
    int start = 0;
    int end = str.length -1;
    while(start <= end) {
      int mid = start + ((end-start)/2);
      if(target < str[mid]){
        end = mid-1;

      }else {
        start = mid+1;
      }
      
     }
     return  str[start % str.length];
  }
}
