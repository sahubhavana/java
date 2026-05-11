// to remove a character from string
       String s = "Banana";
       String result = "";
       char s2 = 'a';
       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) != s2) {
               result += s.charAt(i);
           }
       }
