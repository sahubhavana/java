public static void shiftbyk(int[] arr,int k){
            k = k % arr.length;

            for(int i=0;i<k;i++){
                        int tenp=arr[0];
                        for(int j=0;j<arr.length-1;j++){
                            arr[j]=arr[j+1];
                        }
                        arr[arr.length-1]=tenp;
                    }
                    for(int l=0;l<arr.length;l++){
                        System.out.print(arr[l]+" ");
                    }
        }
