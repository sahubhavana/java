static void merge(int[]arr,int s,int e,int mid){
        int leftlen=mid-s+1;
        int rightlen=e-mid;
        int []leftarray=new int[leftlen];
        int []rightarray=new int[rightlen];


//       copy left half part
        int k=s;
        for(int i=0;i<leftlen;i++){
            leftarray[i]=arr[k];
            k++;
        }

//        copy right half part

        k=mid+1;
        for(int i=0;i<rightlen;i++){
            rightarray[i]=arr[k];
            k++;
        }

        // merge both the array

        int i=0;
        int j=0;
        k=s;
        while(i<leftarray.length&& j<rightarray.length){
            if(leftarray[i]<rightarray[j]){
                arr[k]=leftarray[i];
                i++;
                k++;
            }
            else{
                arr[k]=rightarray[j];
                j++;
                k++;
            }
        }
         //if any  of array either left or right will be left to fill

        while(i<leftarray.length){
            arr[k]=leftarray[i];
            i++;
            k++;
        }

        while(j<rightarray.length){
            arr[k]=rightarray[j];
            j++;
            k++;
        }


    }
    public static  void merge_sort(int[]arr,int l,int r) {
        int s = l;
        int e = r;
        // check whether array have one element // base case

        if (s >= e) {
            return;
        }
        int mid=(s+e)/2;
        //left half
        merge_sort(arr,s,mid);
        //right half
        merge_sort(arr,mid+1,e);

        // merge both half
        merge(arr,s,e,mid);
    }
