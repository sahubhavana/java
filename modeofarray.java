       public static int frequency(int[] arr){
                  HashMap<Integer,Integer>freq=new HashMap<>();
                  for(int num:arr){
                      freq.put(num,freq.getOrDefault(num,0)+1);

                  }

                  for(int key: freq.keySet()){
                      System.out.println(key+" "+freq.get(key));
                  }
                  int maxfreq=-1;
                  int maxfreqkey=-1;
                  for(int key:freq.keySet()){
                      int current=key;
                      int currentkeyfreq=freq.get(key);
                      if(currentkeyfreq>maxfreq){
                          maxfreq=currentkeyfreq;
                          maxfreqkey=current;
                      }
                  }
                  return maxfreqkey;
        }
