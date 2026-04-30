 4.to print a string in reverse order
      String result="";
      for(int i=str.length()-1;i>=0;i--){
          result=result+str.charAt(i);
      }
      System.out.print("Reverse order of string="+result);
