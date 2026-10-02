public static void wave(int[][]arrr){
        for(int i=0;i<arrr.length;i++){
            if(i%2==0){
                int k=i;
                for(int j=0;j<arrr.length;j++){
                    System.out.print(arrr[j][k]+" ");
                }
            }
            else{
                int k=arrr.length-1;
                for(int j=0;j<arrr.length;j++){
                    System.out.print(arrr[k][i]+" ");
                    k=k-1;
                }
            }
            System.out.println();
        }
    }
