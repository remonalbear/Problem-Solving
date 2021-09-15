import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int crimes=0;
        int police=0;
        for (int i = 0; i < n; i++){
            int input = sc.nextInt();
            if(input > 0) {
                police += input;;
            }
            else if (police > 0 ){
                police--;
            }
            else {
                crimes++;
            }
        }
        System.out.println(crimes);
        sc.close();
    }
}
