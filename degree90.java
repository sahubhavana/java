public static void degree90(int[][]arr){
        int[][]a=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            int k=arr[0].length-1;
            for(int j=0;j<arr.length;j++){
             a[i][j]=arr[k][i];
             k--;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
