import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countA = 0; // count for anton wins
        int countD = 0; // count for danik wins
        int n = sc.nextInt(); // get n
        sc.nextLine(); // take the enter hit
        String word = sc.nextLine(); // get the wins sequence
        for(int i = 0; i < n; i++) {
            char ch=word.charAt(i);
            if(ch == 'A') {
                countA++;
            }
            else if (ch == 'D') {
                countD++;
            }
        }
        if(countA > countD) {
            System.out.println("Anton");
        }
        else if(countD > countA) {
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }    
}
