import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(str);
        String distinct = "";
        while (matcher.find()){
            String c =matcher.group();
            if(distinct.contains(c)){
                continue;
            }
            distinct += c;
        }  
        System.out.println(distinct.length());
        sc.close();
    }
}
