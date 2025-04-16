import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your 1st number");
        int a = in.nextInt();
        System.out.println("enter your 2nd number");
        int b = in.nextInt();
        System.out.println("enter your commmand");
        char c = in.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
        }
    }
}
