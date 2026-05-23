to check that a number is 2s power or not

       String binary=Integer.toBinaryString(a);
       int count=0;
       for(int i=0;i<binary.length();i++){
           if(binary.charAt(i)=='1'){
               count=count+1;
           }

       }
       if(count==1){
           System.out.print("number is 2s power");
       }
       else{
           System.out.print("number is not a two power");
       }
