 public String largeOddNum(String s) {
       String  result="";
       int n=s.length();
       for(int i=n-1;i>0;i--){
        if((s.charAt(i)-'0')%2!=0){
            result=result+s.substring(0,i+1);
            break;
        }
        i=0;
        while(i<result.length() && result.charAt(i)=='0'){
            i++;
        }
        result=result.substring(i);
        return result;
         
