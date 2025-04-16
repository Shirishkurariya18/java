public class prime {
    public static void main(String[] args) {
        int  a = 123;
        int original = a;
        int res = 0;
        while (a > 0){
            int digit =  a % 10;
            res = res + digit;
            a = a/10;

        }
        // if (a == res) {
        //     System.out.println("yes it is a palidrome");
        // }else{
        //     System.out.println("no it is not a palidrome");
        // }
        System.out.println("res : " + res);
    }
}
