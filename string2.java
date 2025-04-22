// public class string2 {
//     public static void main(String[] args) {
//         String str  = "hello";
//         String str1 = "hiii";
//         String palindrome = "racecar";
//         if (str == str1) {
//             System.out.println("true");
//         } else{
//             System.out.println("false");
//         }
//     }
// }

// public class string2 {
//     public static void main(String[] args) {
//         // String str = "hello";
//         // String str1 = "hiii";
//         String palindrome = "racecar";
//         String reverse = "racecar";
//         for (int i = palindrome.length()-1; i>=0;  i--) {
//             System.out.println(palindrome.charAt(i));
            
//         }
//         if (palindrome.equals(reverse)) {
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
            
//         }

//     }

// string to convert char array

// public class string2{
    // public static void main(String[] args) {
//         String palindrome = "racecar";
//         char[] arr = palindrome.toCharArray();
//     for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i]);
//     }    }
// }

// calculating how many times r is present in the array
public class string2 {
    public static void main(String[] args) {
        String palindrome = "racecar";
        String target = "r";
        int count = 0;
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) == target.charAt(0)) { // Compare with the first character of target
                count++;
            }
        }
        System.out.println("The character '" + target + "' appears " + count + " times in the string.");
    }
}