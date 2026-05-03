11. to find a occurence of key in array
static int count=0;
public static int countnum(int arr[],int i,int x){
   if(i==arr.length) return count;
   if(arr[i]==x) {
       count = count + 1;
   }
       return countnum(arr,i+1,x);
