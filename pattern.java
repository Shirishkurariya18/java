// public class pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// // control ault n to run the code in terminal

// public class pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 5; j >= i ; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// control ault n to run the code in terminal



// public class pattern {
//     public static void main(String[] args) {
//         for (int i = 5; i >= 0; i--) {
//             for (int k = 0; k <=5-i ; k++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 0; j--) {
                
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            for (int p = 5; p > i ; p--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
        
