import java.util.Scanner;

public class Team {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i = 0; i < n; i++) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int r3 = sc.nextInt();
            if((r1 == 1 && r3 == 1) || (r2 == 1 && r3 == 1) || (r1 == 1 && r2 == 1)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
