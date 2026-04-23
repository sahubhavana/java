 Finding minimum number  in the array
       int arr[];
        arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter a value=");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum number in the array="+min);
