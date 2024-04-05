public class Main {
    public static void main(String[] args) {
      System.out.println(sumSquares(5));
    }
  
    public static int sumSquares(int n){
            if(n == 1){
                return 1;
            }
            return sumSquares(n-1) + n*n;
    }
  }
