Program to find a count of constant in line of text

       int consonantcount=0;
        str=sc.nextLine();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)>='a' && 'z'>=str.charAt(i)) {


            if (str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u' || str.charAt(i) != ' ') {
                consonantcount++;
            }
        }
   }
