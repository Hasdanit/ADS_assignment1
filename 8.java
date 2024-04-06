import java.util.Arrays;
import java.util.Scanner;

public class AllPSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print length of sequence");
        int n = scanner.nextInt();
        System.out.println("Print limit of sequence");
        int k = scanner.nextInt();
        sequence(n, k, new int[n], 0);

    }

    public static void sequence(int n, int k, int[] sequence, int index) {
        if (index == n) {
            System.out.println(Arrays.toString(sequence));
            return;
        }
        for (int i = 1; i <= k; i++) {
            sequence[index] = i;
            sequence(n, k, sequence, index + 1);
        }
    }
}
