import java.util.Scanner;

public class ColorfulStones {
 public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String stones = sc.nextLine();
    String instructions = sc.nextLine();
    int index = 0;
    for(int i = 0; i < instructions.length(); i++) {
        if(Character.toUpperCase(stones.charAt(index)) == Character.toUpperCase(instructions.charAt(i))){
            index++;
        }
    }
    System.out.println(index+1);
    sc.close();

 }   
}
