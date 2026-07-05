public static int robber(int[] arr,int index){
          return house(arr,0);

}
public static int house(int[] arr,int i){
        if(i>=arr.length){
            return sum;
        }
        int take=arr[i]+house(arr,i+2);
         int  nottake=house(arr,i+1);
         return Math.max(take,nottake);
}
