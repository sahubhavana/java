 String s = "raaaajj";
        char ch;
        List<Character> list = new ArrayList<>();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;

        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                ch = (char) (i + 'a');
                list.add(ch);
            }
        }
       System.out.print(list);
    }
