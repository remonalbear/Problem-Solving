import java.util.Scanner;

public class HorseShoe {
 public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
     int [] s = new int[4];
    int count = 0;
     for (int i = 0; i < 4; i++) {
        s[i] = sc.nextInt();
     }
     for (int i = 0; i < 4; i++) {
         int repeat = 0;
        for (int j = i+1; j < 4; j++) {
            if (s[i] == s[j]) {
                repeat++;
            }
         }
         if (repeat == 0) {
            count++;
         }
     }
     System.out.println(4-count);
     sc.close();
 }   
}
