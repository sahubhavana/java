//        to printing a substring of a string
       String s = "abc";
       String sub = "";
       for (int i = 0; i < s.length(); i++) {
           for (int j = i; j < s.length(); j++) {
               sub = sub + s.charAt(j);
               System.out.println(sub);

           }
           sub="";

       }
