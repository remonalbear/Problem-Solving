import java.util.Scanner;

public class DieRoll {
    public static void main(String [] args) {
        Scanner sc  = new Scanner(System.in);
        int yakko = sc.nextInt();
        int wakko = sc.nextInt();
        int max = Math.max(yakko, wakko);
        int diff = (6-max)+1;
        if(6%diff == 0) {
            System.out.println(1+"/"+(6/diff));
        }
        else if(diff%2 == 0) {
            System.out.println((diff/2)+"/"+(6/2));
        }
        else 
        {
            System.out.println(diff+"/"+6);
        }
        sc.close();
    }
}
