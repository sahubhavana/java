84.find a non duplicate element
    public static int duplicate(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==end){
                return arr[mid];
            }
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            else{

                if(arr[mid]==arr[mid-1] && arr[mid]!=arr[mid+1]){
                    int ending=mid;
                    if((ending & 1)==1){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }

                }
                else if(arr[mid]!=arr[mid-1] && arr[mid]==arr[mid+1]){
                    int ending=mid+1;
                    if((ending & 1)==0){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }

                }

            }
        }
        return -1;
    }
