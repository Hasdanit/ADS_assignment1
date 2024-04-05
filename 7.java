import java.math.*;
import java.util.*;
public class SpiralMatrix {


    public static void build_matrix(int msize, int a[][], int size, int value){
        int row, col;
        row = col = (msize - size) / 2;
        if(size==1){
            a[row][col] = value;
            return;
        }
        for(int i =0;i<size-1;++i)
            a[row][col++] = value++;
        for(int i =0;i<size-1;++i)
            a[row++][col] = value++;
        for(int i =0;i<size-1;++i)
            a[row][col--] = value++;
        for(int i =0;i<size-1;++i)
            a[row--][col] = value++;
        build_matrix(msize, a, size-2, value);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("input size : ");
        int size = scan.nextInt();
        int a[][] = new int[size][size];
        build_matrix(size, a, size, 1);
        for(int r=0;r<size;++r){
            for(int c=0;c<size;++c)
                System.out.print(a[r][c]+ " ");
            System.out.println();
        }
    }
}

