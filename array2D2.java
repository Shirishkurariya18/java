//sum of two dimension array 


// public class array2D2 {
//     public static void main(String[] args) {
//         int arr1[][] = {{1,2,4},{1,2,4},{1,4,2}};
//        int arr2[][] = {{1,2,3},{1,2,3},{1,8,6}};
//       int sum = 0;
//       for (int i = 0; i < arr1.length; i++) {
//         for (int j = 0; j < arr1[i].length; j++) {
//           sum += arr1[i][j] + arr2[i][j]; 
//         }
//       }
//       System.out.println("sum of 2 dimension array elements : " + sum);
//     }
// }


// public class array2D2 {
//   public static void main(String[] args) {
//       int arr1[][] = {{1,2,4},{1,2,4},{1,4,2}};
//      int arr2[][] = {{1,2,3},{1,2,3},{1,8,6}};
//      int arr3[][] = {{1,5,7},{9,8,2},{0,0,0}};
//     int sum = 0;
//     for (int i = 0; i < arr1.length; i++) {
//       for (int j = 0; j < arr1[i].length; j++) {
//         sum += arr1[i][j] + arr2[i][j] + arr3[i][j]; 
//       }
//     }
//     System.out.println("sum of 2 dimension array elements : " + sum);
//   }
// }

// import java.util.Scanner;
// public class array2D2 {
//   public static void main(String[] args) {
//     Scanner in = new Scanner (System.in);
//     System.out.println("enter the no of rows : ");
//     int rows = in.nextInt();
//     System.out.println("enter the no of column : ");
//     int column = in.nextInt();
//     int[][] arr = new int[rows][column];

//     System.out.println("enter the values of array : ");
//     int sum = 0;
//     for (int i = 0; i < rows; i++) {
//       for(int j = 0; j < column; j++){

//         arr[i][j] = in.nextInt();
//         sum += arr[i][j];
//       }
//   }
//   System.out.println("----------------------------");
//   System.out.println(sum);
// }
// }


import java.util.Scanner;
public class array2D2 {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("enter the no of rows : ");
    int rows = in.nextInt();
    System.out.println("enter the no of column : ");
    int columns = in.nextInt();
    int[][] arr = new int[rows][columns];

    System.out.println("enter the values of array : ");
  
    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < columns; j++){
        arr[i][j] = in.nextInt();
       
      }
  }
       // Step 1: Find which rows and columns need to be zeroed
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: Set rows to zero
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = 0;
                }
            }
        }
          // Step 3: Set columns to zero
        for (int j = 0; j < columns; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print the result
        System.out.println("Resultant array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}