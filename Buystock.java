21.Buy a stock at minimum and sale it at high cost
             int arr[]={10, 7, 5, 8, 11, 9};
             int maxc=0;
             int cost=0;
             for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]<arr[j]){
                 cost=arr[j]-arr[i];
                     }
                if(cost>maxc){
                   maxc=cost;
                }
                 cost=0;
             }
         }
             System.out.println("Maximum profit from stock="+maxc);
