import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Taking string input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();       // Taking integer input

        System.out.println("Hello " + name + ", you are " + age + " years old.");
        
        sc.close(); // Close the scanner
    }
}