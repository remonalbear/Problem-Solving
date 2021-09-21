import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMath {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = (str.length()+1)/2;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(str.substring(i*2,(i*2)+1));
            arr[i] = m;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i< n-1) {
                System.out.print("+");
            }
        }
        sc.close();
    }   
}
