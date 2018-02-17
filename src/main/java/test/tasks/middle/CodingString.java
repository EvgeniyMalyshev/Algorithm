package test.tasks.middle;

public class CodingString {
    String src = "aaabccdd";
    String rls;

    public CodingString() {
        this.rls = encoding(this.src);
    }

    public String result(String s) {
        return this.rls;
    }

    public static String encoding(String s) {
        int count = 1;
        StringBuilder ss = new StringBuilder();

        for(int i = 1; i <= s.length(); ++i) {
            if (i != s.length() && s.charAt(i) == s.charAt(i - 1)) {
                ++count;
            } else {
                ss.append(count);
                ss.append(s.charAt(i - 1));
                count = 1;
            }
        }

        return ss.toString();
    }
}
