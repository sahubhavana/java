18.Count no of vowel in string
static int count=0;
public static int strvowel(String s,int i){
   if(i==s.length()) return count;
   char ch=s.charAt(i);
   if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
       count=count+1;
   }
   return strvowel(s,i+1);
}
