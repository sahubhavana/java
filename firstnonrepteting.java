//     to find first none repating character
        String str="aabbcd";

        for(int i=0;i<str.length();i++){
           int  count=0;
            for(int j=0;j<str.length();j++) {
                if ((str.charAt(i)) == (str.charAt(j))) {
                    count = count + 1;
                }
            }
                if(count==1){
                    System.out.println(str.charAt(i));
                    break;

                }


            }
