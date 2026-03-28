import java.util.*;
public class array {
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
       int[] marks=new int[3];
       marks[0]=97;
       marks[1]=90;
       marks[2]=89;
       System.out.println(marks[0]);
       System.out.println(marks[1]);
       System.out.println("enter a size of array");
       int size=sc.nextInt();
        /  with user input way
       int marks[]=new int[size];
       for (int i=0;i<size;i++){
           marks[i]=sc.nextInt();
       }
       for(int i=0;i<size;i++){
           System.out.print(marks[i]);
       }
       int[] emp=new int[5];

       for(int i=0;i<5;i++){
           System.out.println("enter a element");
           emp[i]= sc.nextInt();
       }
       System.out.println("enter a element which you want to search");
       int ele=sc.nextInt();
       for(int i=0;i<5;i++){
           if(emp[i]!=ele) {

           }
           else{
               System.out.println("element found");
               break;
           }
       }
