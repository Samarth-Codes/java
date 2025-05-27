import java.util.Scanner;

public class arrayhomework {
    public static void main(String[] args) {
       
       Question 1
       Scanner sc = new Scanner(System.in);
  int n =sc.nextInt();
  int[] arr = new int[n];
  for(int i=0;i<n;i++){
      arr[i]=(i+1)*(i+1);
      System.out.println(arr[i]);
  }


       
    Question 2
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array A: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the size of array B: ");
        int n2 = sc.nextInt();

        int[] A = new int[n1];
        int[] B = new int[n2];

        // Input array A
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        // Input array B
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        // Print intersection
        System.out.println("Intersection:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (A[i] == B[j]) {
                    System.out.println(A[i]);  // or B[j]
                    break; // avoids duplicates in case B contains repeating numbers
                }
            }
        }
    }*/
          Question 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxvalue=Integer.MIN_VALUE;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            maxvalue=Math.max(arr[i],maxvalue);
            minvalue=Math.min(arr[i],minvalue);

        }

        System.out.println("Max: " + maxvalue);
        System.out.println("Min: " + minvalue);



    //QUESTION 4
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }



    }}
