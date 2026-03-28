import java.util.*;
public class conditional {
    public static void main(Strings args[]) {
        Scanner sc = new Scanner(System.in);
       int age=sc.nextInt();
       if(age>=18){
           System.out.println("You are adult");

       }
       else{
           System.out.println("you are not a adult");
       }
       int a=sc.nextInt();
       int b=sc.nextInt();
       if(a==b){
           System.out.println("Equal");
       }
       else{
           if(a>b){
               System.out.println("a is greater than b");
           }
           else{
               System.out.println("b is greater than a");
           }
       }
   }


       int button = sc.nextInt();
       if(button==1){
           System.out.println("Hello");
       }
       else{
           if(button==2){
               System.out.println("Namaste");
           }
           else{
               if(button==3){
                   System.out.println("Bonjour");
               }
           }

        switch(button){
            case 1:
                System.out.println("Hello");
            case 2:
                System.out.println("Namaste");
            case 3:
                System.out.println("Bonjour");
        }

    }
}
