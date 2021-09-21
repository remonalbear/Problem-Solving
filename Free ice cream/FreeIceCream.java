import java.util.Scanner;

public class FreeIceCream {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextInt();
        int count = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String d = sc.nextLine();
            char sign = d.charAt(0);
            int amount = Integer.parseInt(d.substring(2));  
            if (sign == '+') {
                x += amount;
            }
            else if (x >= amount) {
                x -= amount;
            }
            else {
                count++;
            }
        }

        System.out.println(x+" "+count);
        sc.close();
    }
}
