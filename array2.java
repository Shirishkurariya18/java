// import java.util.Scanner;

// public class array2 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("enter the size of array : ");
//         int n = in.nextInt();
//         int[] arr = new int[n];

//         System.out.println("enter the values of array : ");

//         for (int i = 0; i < n; i++) {
//             arr[i] = in.nextInt();
//         }
//         System.out.println("elements of array is ----------------------------");
//         for (int j = 0; j < n; j++) {
//             System.out.println(arr[j]);
//         }
//     }
// }


// reverse the array

// import java.util.Scanner;

// public class array2 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("enter the size of array : ");
//         int n = in.nextInt();
//         int[] arr = new int[n];

//         System.out.println("enter the values of array : ");

//         for (int i = 0; i <= n-1; i++) {
//             arr[i] = in.nextInt();
//         }
//         System.out.println("elements of array is ----------------------------");
//         for (int j = n-1; j >= 0; j--) {
//             System.out.println(arr[j]);
//         }
//     }
// }


// sum of array


import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter the size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the values of array : ");

        for (int i = 0; i <= n-1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("sum of array is ----------------------------");
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + arr[j];
        }
        System.out.println(sum);
    }
}
