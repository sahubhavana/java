class BrowserHistory {
    Stack<String>currhistory;
    Stack<String>forwardhistory;
    public BrowserHistory(String homepage) {
        currhistory=new Stack<>();
        forwardhistory=new Stack<>();

        /// current me homepage ko push karnege
        currhistory.push(homepage);
    }
    
    public void visit(String url) {
        ///current url ko visit karke push karo and forward ko clear
        currhistory.push(url);
        while(!forwardhistory.isEmpty()){
            forwardhistory.pop();
        }
    }
    
    public String back(int steps) {

        // jab tak step hai or homepage ke pahle tak ham tab tak pop kar ke forward me dalege
        while(steps>0){
           if(currhistory.size()>1){
            String currdata=currhistory.pop();
            forwardhistory.push(currdata);
           }
           else{
            break;
           }
           steps--;
        }
        return currhistory.peek();
    }
    public String forward(int steps) {
        // jab tak forward me data hai to move karnge 

        while(steps>0){
            if(forwardhistory.size()>0){
                String data=forwardhistory.pop();
                currhistory.push(data);
            }
            else{
                break;
            }
            steps--;
        }
        return currhistory.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
