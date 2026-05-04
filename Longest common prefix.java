15.Longest commmon prefix
       String[] st = {"flowers", "flow", "fly", "flight"};
       String res="";
       for (int i = 0; i < st[0].length(); i++) {
           char ch = st[0].charAt(i);

           for (int j = 1; j < st.length; j++) {
               if (i >= st[j].length() || st[j].charAt(i) != ch) {
                   System.out.print(res);
                   return;
               }
           }

           res = res + ch;
       }

       System.out.print(res);


