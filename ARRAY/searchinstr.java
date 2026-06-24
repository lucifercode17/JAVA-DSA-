package ARRAY;

public class searchinstr {
  public static void main(String[] args) {
    String str = "dheeraj";
    char target = 'o';
    boolean answer = charsearch(str, target);
    System.out.println(answer);

  }

  static boolean charsearch(String str, char target) {
    if (str.length() == 0) {
      return false;
    }
    for (int index = 0; index < str.length(); index++) {
      if (target == str.charAt(index)) {
        return true;
      }

    }
    return false;
  }

  static boolean charsearch1(String str, char target){
    if(str.length() == 0){
      return false;
    }
    for(char ch :str.toCharArray()){
      if(ch == target){
        return true;
      }
    }


    return false;
}
}
