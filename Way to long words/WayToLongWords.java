import java.util.Scanner;

public class WayToLongWords {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] outputs = new String [n];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if(str.length()>10){
                outputs[i] = str.charAt(0)+String.valueOf(str.length()-2)+str.charAt(str.length()-1);
            }
            else {
                outputs[i] = str;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(outputs[i]);
        }
        sc.close();

    }
}
