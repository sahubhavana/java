Take a array a print the sum of all element  that can present in array
       int arr[];
        arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter a value=");
            arr[i]=sc.nextInt();
        }
       int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of all the number="+sum);
