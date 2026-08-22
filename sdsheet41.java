class Solution {
    public int myAtoi(String input) {
      String s = input.trim();

    int n = s.length();

    if (s.isEmpty()) {
        return 0;
    }

    int sign = 1;
    int i = 0;

    // Check sign
    if (s.charAt(i) == '-' || s.charAt(i) == '+') {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    int num = 0;

    while (i < n && Character.isDigit(s.charAt(i))) {

        int digit = s.charAt(i) - '0';

        // Overflow check
        if (num > (Integer.MAX_VALUE - digit) / 10) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        num = num * 10 + digit;

        i++;
    }

    return num * sign;
}
}
