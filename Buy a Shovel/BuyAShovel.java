import java.util.Scanner;

public class BuyAShovel {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int count = 1;
        while(((k * count)%10 != 0) && (((k * count) - r)%10 != 0)){
            count++;
        } 
        System.out.println(count);
        sc.close();
    }
}
