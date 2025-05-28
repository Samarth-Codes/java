import java.util.Scanner;

public class arrayinputoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Output array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
