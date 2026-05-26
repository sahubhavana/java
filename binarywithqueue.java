2.To generate binary number from 1 to n using queue
       Queue<String> q1=new LinkedList<>();
       q1.offer("1");
       System.out.print("enter a number=");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           String s="";
           String a=q1.poll();
           System.out.print(a+" ");
           q1.offer(a+"0");
           q1.offer(a+"1");
       }
