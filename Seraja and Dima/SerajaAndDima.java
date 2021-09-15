import java.util.Scanner;

public class SerajaAndDima {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int head = 0;
        int tail = n-1;
        int SerajaScore=0,DimaScore = 0;
        // read input
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // calculate score
        for (int i = 0; i < n; i++){
            if (arr[head] > arr[tail]){
                if (i%2 == 0) {
                    SerajaScore += arr[head];
                }
                else {
                    DimaScore += arr[head];
                }
                head++;
            }
            else {
                if (i%2 == 0) {
                    SerajaScore += arr[tail];
                }
                else {
                    DimaScore += arr[tail];
                }
                tail--;
            }
        }
        sc.close();
        System.out.println(SerajaScore+" "+DimaScore);
    }
    
}
