static int temp;
   public static void array3(int arr[],int i,int j){
       if(i>=j) return ;
       temp=arr[j];
       arr[j]=arr[i];
       arr[i]=temp;

       array3(arr,i+1,j-1);

   }
