28.Printing a path of grid

public static void path(String p,int r,int c){
   if(r==1&c==1){
       System.out.println(p);
   }
   if(r>1) path(p+"D",r-1,c);
   if(c>1) path(p+"R",r,c-1);
}
