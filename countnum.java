//        to count a number from string
        String s="123@bhavana";
        int countnum=0;
        for(int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))) {
                countnum=countnum+1;
            }
        }
        System.out.println("Number of digit in string is="+countnum);
