import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int totalRotations = 0;
        char index = 'a';
        for(int  i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            int rotations = Math.abs(index - ch); // get number of clockwise steps
            totalRotations += Math.min(rotations, Math.abs(26-rotations)); // choose minimum from clockwise or unticlockwise steps
            index = ch;
        }
        System.out.println(totalRotations);
        sc.close();
    }
}
