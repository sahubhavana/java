int co=0;
    int cc=0;
     if(str.length()%2!=0){
        System.out.print("-1");
    }
     for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='('){
            co++;
        }
        else{
            if(co>0){
                co--;
            }
            else{
                cc++;
            }
        }
    }


    // Return minimum reversals required
        System.out.print((co + 1) / 2 + (cc + 1)/2) ;
