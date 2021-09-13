import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int minCount=0;
        for(int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if(a > h) {
                minCount+=2;
            }
            else  {
                minCount+=1;
            }
        }
        System.out.println(minCount);
    }
}