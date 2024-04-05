public class Main {
    public static void main(String[] args) {
      int p[] = {0,1,2,3,4,5};
        System.out.println(sumArray(p, 4));
    }
  
    public static int sumArray(int[] arr, int n){
        if (n == 0){
            return arr[n];
        }
        else{
            return sumArray(arr, n-1) + arr[n];
        }
    }
  }
