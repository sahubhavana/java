   public static void swapalternate(int[] arr){
        int i=0;
        while(i<arr.length){
            if(i==arr.length-1){
                break;
            }
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;

        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,4,5,6,7,8};
        swapalternate(arr);
    }
}
