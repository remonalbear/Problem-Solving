import java.util.Scanner;

public class ShassAndOskols {
    public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] arr = new int [n]; // array represent the wires
     for (int i = 0; i < n; i++) { // scan the number pf birds at each wire
         arr[i] = sc.nextInt();
     }   
     int m = sc.nextInt();
     for (int i = 0; i < m; i++) { // scan each shot
         int x = sc.nextInt();
         int y = sc.nextInt();
         if(x > 1) { // if there is wire above
            arr[x-2] += (y-1); // fly the bidrs to the left above
         }
         if(x < n && (arr[x-1] >= y)) { // if there is a wire below and birds to the right
            arr[x] += (arr[x-1]-y); // fly the bidrs to the left below
         }
         arr[x-1] = 0; // the wire shotted is empty
     }

     for (int i = 0; i < n; i++) {
         System.out.println(arr[i]);
     }
     sc.close();
    }
}
