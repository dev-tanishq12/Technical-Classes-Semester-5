import java.util.*;

public class ZeroSumArray {

    public static boolean hasZeroSumSubarray(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // check if sum is 0
            if(sum == 0){
                return true;
            }
            // check if sum was already seen
            if(set.contains(sum)){
                return true;
            }
            // otherwise store sum
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, -3, 1, 6};

        System.out.println(hasZeroSumSubarray(arr));
    }
}