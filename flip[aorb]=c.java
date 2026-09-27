20.Minimum Flips to Make a OR b = c
              public static int flipbit(int a, int b,int c){
                 int count=0;
                 while(a!=0||b!=0|c!=0){
                     int bita=a&1;
                     int bitb=b&1;
                     int bitc=c&1;
                     if(bitc==1){
                         if(bita==0&&bitb==0){
                             count++;
                         }
                     }
                     else{
                         count+=bita+bitb;
                     }
                     a=a>>1;
                     b=b>>1;
                     c=c>>1;
                 }
                 return count;
              }
