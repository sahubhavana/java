To check a anagram or not
       String s1="silent";
       String s2="listen";
       if(s1.length()!=s2.length()){
           System.out.println("String are not a anagram");
       }
       char[] a=s1.toCharArray();
       char[] b=s2.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       if(Arrays.equals(a,b)){
           System.out.println(" String are anagram");
       }
       else{
           System.out.println("Strings are not anagram");
       }
