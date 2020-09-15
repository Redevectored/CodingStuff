import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        int[] down = new int[] {3, 2, 1, 4, 5, 6};
        down = downUpMerge(down);
        System.out.println(Arrays.toString(down));
    }

    static int[] downUpMerge(int[] arr) {
        int n = arr.length / 2;

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                result[i] = arr[n - 1 - i];
            } else {
                result[i] = arr[i];
            }
        }
        return result;
    }
}
