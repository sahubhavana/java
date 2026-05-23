3.Swap a two number using XOR operator
       System.out.println("Enter two  number");
       int a = sc.nextInt();
       int b=sc.nextInt();
       a=a^b;
       b=a^b;
       a=a^b;
       System.out.println(a);
       System.out.println(b);
