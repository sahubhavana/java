lass Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        
        if(head==null){
            return new int[]{-1,-1};
        }


        int count=1;
        int[]ans=new int[2];
        
        
        int min=Integer.MAX_VALUE;
        ListNode temp=head.next;
        ListNode prev=head;
        ListNode temp1=(temp == null) ? null : temp.next;

        while(temp!=null && temp.next!=null){
            if((temp.val>prev.val)&(temp.val>temp1.val)||
            (temp.val<prev.val)&(temp.val<temp1.val)){
                list.add(count);
             }
             count++;
             prev=prev.next;
             temp=temp.next;
             if(temp!=null){
                temp1=temp1.next;
             }
        }

        if(list.size()<2){
            return new int[]{-1,-1};
        }
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        int max = list.get(list.size() - 1) - list.get(0);


      return new int[]{min, max};
    }
}
