public class Main {
    public static void main(String[] args) {
      System.out.println(sumPositive(5));
    }
  
    public static int sumPositive(int n){
        if(n == 1){
            return 1;
        }
        else{
            return sumPositive(n-1) + n;
        }
    }
  }
