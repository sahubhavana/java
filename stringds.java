String s="abcab";
        String sub="";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                sub=sub+s.charAt(j);
                if(sub.charAt(i)==sub.charAt(sub.length()-1)){
                    count=count+1;
                }
            }
        }
        System.out.println(count);

    }
}
