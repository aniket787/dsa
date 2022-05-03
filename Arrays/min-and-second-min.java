import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int val : arr) {
            set.add(val);

            if (val < min) {
                smin = min;
                min = val;
            } else if (val < smin) {
                smin = val;
            }
        }

        System.out.println(min + " " + smin);
    }
}