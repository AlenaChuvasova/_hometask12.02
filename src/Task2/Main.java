package Task2;

public class Main {

    public static int func(int k, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            //System.out.print(arr[i] + " ");
            //System.out.print('\n');
        }
        int res = 0;
        if (k >= 0) {
            res = arr[k];

        } else {
            res = arr.length + k;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(func(1, new int[6]));

    }
}
