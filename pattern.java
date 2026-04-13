for(int i=0;i<n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.print("   ");
        for(int i = 0; i < n; i++) {
            for(int j = n - i; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
