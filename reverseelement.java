 public static Queue<Integer> reverse(Queue<Integer>dq,int k){
        Deque<Integer> dq1=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            dq1.offerFirst(dq.poll());
        }
        while(!dq.isEmpty()){
            dq1.add(dq.poll());
        }
        return dq1;
    }
