import java.util.Scanner;

public class NewPassword {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int programming = 0,math = 0,pe = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                programming++;
            }
            else if(arr[i] == 2) {
                math++;
            }
            else {
                pe++;
            }
        }
        System.out.println(Math.min(programming, Math.min(math, pe)));
    }
}
