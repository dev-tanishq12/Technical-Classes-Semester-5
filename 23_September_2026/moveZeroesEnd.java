import java.util.*;

public class moveZeroesEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);

        System.out.println("Array after moving zeroes to the end: " + Arrays.toString(arr));

        sc.close();
    }

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int j =0 ;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                j++;
            }
        }
    }
}
