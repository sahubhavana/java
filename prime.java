To check number is prime or not

       boolean cp = true;

       for (int i = 2; i < a; i++) {
           if (a % i == 0) {
               cp = false;
               break;
           }
       }

       if (cp == true) {
           System.out.println("Number is prime");
       } else {
           System.out.println("Number is not prime");
       }
  }
}
