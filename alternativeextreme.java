//  47.Print a alternate extreme element
      int arr[]={1,2,3,4,5,6};
      int i=0;
      int j=arr.length-1;
      while( i<arr.length){
          System.out.println(arr[i]+" "+arr[j]);
          i++;
          j--;
          if(i>j){
              break;
          }
      }
