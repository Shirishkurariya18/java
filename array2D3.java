// matrix formation

// public class array2D3 {
// public static void main(String[] args) {
//     int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//             System.out.println(arr[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
// }

// sum of all elements of matrix
// public class array2D3 {
//     public static void main(String[] args) {
//         int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         int sum = 0;
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[i].length; j++) {
//                   //  System.out.println(arr[i][j] + " ");
                 
//                     sum += arr[i][j];
//                 }
//             }  
//                 System.out.println(sum);
              
//     }
// }

// column wise sum of matrix
// public class array2D3 {
//     public static void main(String[] args) {
//       int [][] arr = {{1,2,3},{4,5,6},{5,8,9}};

//       for (int j = 0; j < arr[0].length; j++) {
//         int colSum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             colSum += arr[i][j];
//         }
//         System.out.println("Sum of Column " + j + ": " + colSum);
//      }


//     }
// }

//  row wise sum of matrix
// public class array2D3 {
//     public static void main(String[] args) {
//       int [][] arr = {{1,2,3},{4,5,6},{5,8,9}};
//       for (int i = 0; i < arr.length; i++) {
//         int sum = 0;
//         for (int j = 0; j < arr[i].length; j++) {
//             sum += arr[i][j];
//         }
//         System.out.println("sum of row " + i + " : " + sum);
//       }
//     }
// }

// find largest element in the matrix

// public  class array2D3 {
//     public static void main(String[] args) {
//         int [][] arr = {{1,2,3},{4,5,6},{5,8,9}}; 
//         int max = arr[0][0];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] > max) {
//                    max = arr[i][j]; 
//                 }
                
//             }
//         }
//         System.out.println("largest element : " + max);
//     }
// }

// find smallest element in the matrix
public class array2D3{
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{5,8,9}}; 
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("smallest element : " + min);
    }
}