public static char getmaxoccurencechar(String str){
        int[] freq=new int[26];
        for(int i=0;i<str.length()-1;i++){
            int x=str.charAt(i)-'a';
            freq[x]++;
        }
        int max=-1;
        char c='a';
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
                c=(char)(i+'a');
            }
        }
        System.out.print(" "+max);

        return c;
    }
