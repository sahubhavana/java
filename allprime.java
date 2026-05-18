10. Print all the prime number from 1 to n
       if(num==1){
           System.out.print(1);
       }
            for(int i=2;i<=num;i++){

                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }

             }
    }
