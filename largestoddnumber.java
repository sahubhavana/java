14.Return  largest odd number from a string
       String result = "";
       int n = str.length();
       for (int i = n - 1; i >=0; i--) {
           if ((str.charAt(i) - '0') % 2 != 0) {
               result = result + str.substring(0, i + 1);
               break;

           }
       }
       int i = 0;
       while (i < result.length() && result.charAt(i) == '0') {
           i++;
       }
       result = result.substring(i);
       System.out.print(result);
