package leetcode.top150;

public class Util {

    public static void display(int[] result) {
        for (int i: result) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void swap (int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}
