import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumPower(2, 3));
    }
  
    public static double sumPower(int b, int n){
        if (n == 0){
            return Math.pow(b, n);
        }
        else{
            return sumPower(b, n-1) + Math.pow(b,n);
        }
    }
  }
