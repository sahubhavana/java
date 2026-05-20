/29.Printing a substring from a String
public static void sub(String result,String s,int i){
   if(i==s.length()){
       System.out.println(result);
       return ;
   }
   sub(result+s.charAt(i),s,i+1);
   sub(result,s,i+1);
}
