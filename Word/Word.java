import java.util.Scanner;

public class Word {
  public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int lowerCount=0;
      for (char c : str.toCharArray()) {
          if (Character.isLowerCase(c)) {
            lowerCount++;
          }
      }
      if ((str.length() - lowerCount) > lowerCount) {
          System.out.println(str.toUpperCase());
      }
      else {
          System.out.println(str.toLowerCase());
      }
      sc.close();
  }  
}
