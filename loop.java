import java.util.Scanner;

public class loops {


    public static void main(Strings args[]) {
        Scanner sc = new Scanner(System.in);
       for(int i=0;i<11;i++){
           System.out.println(i);
       }
       int sum=0;
       int n=sc.nextInt();
       for(int i=0;i<=n;i++){
           sum=sum+i;
       }
       System.out.println("Summistion of n natural number"+sum);
       int n=sc.nextInt();
       for(int i=1;i<11;i++){
           System.out.println(n+"*"+i+"="+i*n);
       }


    }
}
