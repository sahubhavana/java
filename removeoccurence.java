public static String removeoccurence(String str,String part){

        while(str.contains(part)){
            int x=str.indexOf(part);
            str=str.substring(0,x)+str.substring(x+part.length());
        }
        return str;
    }
