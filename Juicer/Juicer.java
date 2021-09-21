import java.util.Scanner;

public class Juicer {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int total = 0;
        int count = 0; 
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a > b) {
                continue;
            }
            else {
                total += a;
                if(total > d) {
                    count++;
                    total = 0;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
