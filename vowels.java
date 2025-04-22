public class vowels {
    public static void main(String[] args) {
        String palindrome = "racecarjhdgaha";
        String target = "aeiou";
        int count = 0;

        System.out.print("The vowels are: ");
        for (int i = 0; i < palindrome.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                if (palindrome.charAt(i) == target.charAt(j)) {
                    System.out.print(palindrome.charAt(i) + " "); // Print the vowel
                    count++;
                    break; // Exit the inner loop once a match is found
                }
            }
        }
        System.out.println("\nTotal number of vowels: " + count);
    }
}