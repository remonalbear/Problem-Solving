import java.util.Scanner;

public class Magnets {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int groupCount=1;
        int n = sc.nextInt();
        int prev = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int curr=sc.nextInt();
            if(curr == prev) {
                prev = curr;
            }
            else {
                groupCount++;
                prev = curr;
            }
        } 
        System.out.println(groupCount);
        sc.close();
    }
}
