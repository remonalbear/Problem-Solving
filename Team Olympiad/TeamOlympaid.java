import java.util.Scanner;

public class TeamOlympaid {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int progCount = 0, mathCount = 0, peCount = 0;
        int [][] teams = new int [3][n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 1){
                teams[0][progCount] = i+1;
                progCount++;
            }
            else if(arr[i] == 2) {
                teams[1][mathCount] = i+1;
                mathCount++;
            }
            else {
                teams[2][peCount] = i+1;
               peCount++;
            }
        }
        int min = Math.min(progCount, Math.min(mathCount, peCount));
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            System.out.println(teams[0][i]+" "+teams[1][i]+" "+teams[2][i]);
        }
        sc.close();
    }
}
