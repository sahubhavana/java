 7.Greater common divisor
   int num1=sc.nextInt();
    int mx=Math.max(num,num1);
    int maxgcd=0;
    for(int i=1;i<mx;i++){
        if(num%i==0 && num1%i==0){
            if(i>maxgcd){
                maxgcd=i;
            }
        }
    }
    System.out.print("maximum comman divisor="+maxgcd);
