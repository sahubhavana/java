4.Find a unique element which does not appear twice
       int x=0;
       int arr[]={10,80,23,23,56,10,80};
       for(int i=0;i<arr.length;i++){
          x= x^arr[i];
       }
      System.out.print(x);
