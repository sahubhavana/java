  // reverse complete array
        reverse(s, 0, s.length - 1);

        int start = 0;

        // reverse each word
        for (int end = 0; end <= s.length; end++) {

            if (end == s.length || s[end] == ' ') {

                reverse(s, start, end - 1);

                start = end + 1;
            }
        }
    }

    public void reverse(char[] s, int i, int j) {

        while (i < j) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
