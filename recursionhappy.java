public static void printhappy(int n) {
        if (n == 0) {

            System.out.print("Finally birthday came HAppy Birthday");
            return;
        }

        System.out.println(n + " Day left for birthday");
        printhappy(n - 1);
    }
