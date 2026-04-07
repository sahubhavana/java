//String comparision
       String s = "aabbcccde";
       int count = 1;
       String result = "";
       for (int i = 0; i <s.length()-1; i++) {

           if (s.charAt(i) == s.charAt(i + 1)) {
               count = count + 1;
           } else {
               result = result + s.charAt(i) + count;
               count = 1;
           }
       }

    System.out.println(result);
