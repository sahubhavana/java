2.Count all digit of number
       int count = 0;
       if (num == 0) {
           System.out.print("number of digit present=" + 1);
       } else {
           while (num > 0) {
               count++;
               num = num / 10;
           }
           System.out.print("Number of digit present in number=" + count);
       }
