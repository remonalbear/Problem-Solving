import java.util.Scanner;

public class Games {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int [n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int[] host = arr[i];
            for (int j = 0; j < n; j++) {
                int[] guest = arr[j];
                if (host[0] == guest[1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
