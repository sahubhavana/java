public static void subbsequence(int []arr,int i,int j){
        if(i==arr.length){
            return;
        }
        if(j==arr.length){
            subbsequence(arr,i+1,i+1);
            return;
        }
        for(int k=i;k<=j;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        subbsequence(arr,i,j+1);
    }
