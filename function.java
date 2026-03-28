import java.util.*;
public class function {
   public static void printname(String name){
       System.out.println("my name is ="+name);
       return ;
   }
public static int  sumnum(int a ,int b){
   int sum=0;
   sum=a+b;
   return sum;

}
public static int  factorial(int num){
   int fact=1;
   for(int i=num;i>=1;i--){
       fact=fact*i;
   }
   return fact;
}
public static void avereage(int a,int b,int c){
   int avg=(a+b+c)/3;
   System.out.println("Average of three number"+avg);
}


    public static void main(Strings arg[]){
        Scanner sc=new Scanner(System.in);
       String name=sc.next();
       printname(name);
      int a=sc.nextInt();
      int b=sc.nextInt();
       int c=sc.nextInt();
       int x=sumnum(a,b);
       System.out.println("Sum of two number"+x);
       int n=sc.nextInt();
       int f=factorial(n);
       System.out.println("factorial of number="+f);
       avereage(a,b,c);

    }
}
