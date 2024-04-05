import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printReversedStrings(n, scan);
    }
  
    public static void printReversedStrings(int n, Scanner scan){
        if (n > 0) {
            String str = scan.nextLine();
            printReversedStrings(n - 1, scan);
            System.out.println(str);
        }
    }
  }
