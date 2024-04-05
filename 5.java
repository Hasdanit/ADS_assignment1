import java.math.*;

public class Main {
    public static void main(String[] args) {
        printRSequence(5);
    }
  
    public static void printRSequence(int n){
        if(n == 0){
            System.out.println(0);
        }
        else{
            System.out.print(n + " ");
            printRSequence(n-1);
        }
    }
  }
