13.Return a string ina reverse manner


        String[] words = str.trim().split("\\s+");
        String s = " ";
        for (int i = words.length - 1; i >= 0; i--) {
            s = s + words[i]+" ";

        }
        s=s.trim();
        System.out.print(s);
