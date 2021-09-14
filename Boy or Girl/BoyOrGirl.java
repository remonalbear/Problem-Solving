import java.util.Scanner;

public class BoyOrGirl {
 public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String username = sc.nextLine();
    String chars="";
    for (char c : username.toCharArray()) {
        if (chars.indexOf(Character.toLowerCase(c)) >= 0) {
            continue;
        }
        else {
            chars = chars + Character.toLowerCase(c);
        }
    }
    if(chars.length()%2 == 0) {
        System.out.println("CHAT WITH HER!");
    }
    else {
        System.out.println("IGNORE HIM!");
    }
    sc.close();
 }   
}
