17.REturn a index sum of elemnent which is equal to k
             int nums[]={-6, 7, 1, -7, 6, 2};
               int target;
               System.out.println("eneter a value of target=");
               target=sc.nextInt();
               for(int i=0;i<nums.length;i++){
                   for(int j=i+1;j<nums.length;j++){
                       if((nums[i]+nums[j])==target){
                           System.out.print(i+" ");
                           System.out.print(j);
                       }
                   }
               }

          }
        }
