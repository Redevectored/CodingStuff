public class TestClass {

    int[] downUpMerge(int[] arr) {
        int n = arr.length / 2;

        int[] sortedArr = new Array[arr.length];
        for(int i = n - 1; i <=0; i--;) {
            sortedArr[n - 1 - i] = arr[i];
        }
        for(int i = n; i < arr.length; i++) {
            sortedArr[n + i] = arr[i];
        }
        return sortedArr;
    }
}
