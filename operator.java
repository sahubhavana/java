import java.util.*;
public class Bitwiseoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two number");
        int a = sc.nextInt();
       int b=sc.nextInt();
       System.out.println("operation of And="+(a&b));
       System.out.println("operation of OR="+(a|b));
        System.out.println("operation of NOT="+(~a));
       System.out.println("operation of XOR="+(a^b));
