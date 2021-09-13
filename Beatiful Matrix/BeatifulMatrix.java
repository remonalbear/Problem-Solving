import java.util.Scanner;

public class BeatifulMatrix {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [25];
        int index = 26;
        int count = 0;
        for(int i = 0; i < 25; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1) {
                index = i;
            }
        }
        int row = index/5;
        int col = index%5;
        count += Math.abs((row - 2));
        count += Math.abs((col - 2));
        System.out.println(count);
        sc.close();
    }
}
