import java.util.Scanner;

public class CarrotCake {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
        int without = (int)Math.ceil(n/(double)k) * t;
        n -= (d/t)*k;
        int with =d + ((int)Math.ceil(n/(2.0*k)) * t);
        if (without <= with) {
            System.out.println("No");
        }
        else {
            System.out.println("YES");
        }
    sc.close();
    }
}
