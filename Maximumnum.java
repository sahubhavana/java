2.Find a MAximum number in the array
       int arr[];
        arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter a value=");
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum number in the array="+max)
