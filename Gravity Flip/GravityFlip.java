import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cols=new int[n];
        for (int i = 0; i < n; i++) {
            cols[i]=sc.nextInt();
        }
        Arrays.sort(cols);
        for (int i = 0; i < n; i++) {
            System.out.print(cols[i]+" ");
        }

        sc.close();

    }
}
