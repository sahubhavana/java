59.Remove duplicate from sorted array
           int num[]={-20,-20,-16,-10,-2,-1,4,8};
           int j=0;
           for(int i=1;i<num.length;i++) {
               if (num[i]!=num[j]) {
                   j++;
                   num[j]=num[i];

               }

           }
             for(int i=0;i<=j;i++){
                 System.out.print(num[i]+" ");

           }
