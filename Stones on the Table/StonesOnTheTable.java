import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt(); // read n and ignore it
        sc.nextLine(); // read the enter key
        String str = sc.nextLine(); // read the String 
        char prev = Character.toUpperCase(str.charAt(0)); // assign previous value to the first char
        int count = 0; // number of chars need to be removed
        for (int i = 1; i < str.length(); i++) { // loop over the chars
            char curr = Character.toUpperCase(str.charAt(i)); // get the current char
            if(curr == prev) { // if its equal to the previous one invrement the count
                count++;
            }
            prev = curr; // update previous value
        }
        System.out.println(count);
        sc.close();
    }
}
