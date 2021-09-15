import java.util.Scanner;

public class BlackSquare {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [4];
        int calories = 0;
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt(); 
        }
        sc.nextLine();
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int index = Integer.parseInt(str.substring(i, i+1));
            calories += arr[index-1];
        }
        System.out.println(calories);
        sc.close();
    }
}
