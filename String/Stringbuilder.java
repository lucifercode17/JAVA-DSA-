package String;

public class Stringbuilder {
  public static void main(String[] args) {
    // string bulider is  mutable 

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      char ch = (char)('a' +i);
      builder.append(ch);
      
    }
    System.out.println(builder.toString());
  }
  
}
