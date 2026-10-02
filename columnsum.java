public static void columnsum(int[][] arrr){
        int sum=0;
        int k=0;
        for(int i=0;i<arrr.length;i++){
            for(int j=0;j<arrr.length;j++){
                sum=sum+arrr[j][k];
            }
            k++;
            System.out.print(sum+" ");
            sum=0;
        }
    }
