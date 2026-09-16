import java.util.Scanner;
public class missing_number {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0; i<n-1; i++){
        arr[i] = sc.nextInt();
    }

    int actual_sum = n * (n+1)/2;
    int sum = 0;
    for(int i=0; i<n; i++){
        sum += arr[i];
    }
    int missing_number = actual_sum - sum;
    System.out.println("Missing number is: " + missing_number);
    sc.close();
    }
}
