// // 2Dimensional array 

// public class array2D {
//     public static void main(String[] args) {
//         int [][] arr = {{1,2,3,4},{1,2,3,4}};
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

public class array2D {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3,4},{1,2,3,4}};
        int [] sum = new int[arr1[0].length];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                sum[j] += arr1[i][j];

            }
          System.out.println("sum of row" + i + " is : " + sum[i]);
        }
        
    }
}

