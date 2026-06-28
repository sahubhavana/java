import java.util.*;

class Solution {

    ArrayList<String> ls = new ArrayList<>();

    public List<String> generateBinaryStrings(int n) {
        bin(n, "");
        return ls;
    }

    public void bin(int n, String s) {

        if (n == 0) {
            ls.add(s);
            return;
        }

        bin(n - 1, s + "0");
        bin(n - 1, s + "1");
    }
}
