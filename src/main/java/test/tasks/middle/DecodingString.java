package test.tasks.middle;

public class DecodingString {
    String src = "3a1b2c2d";
    String rls;

    public DecodingString() {
        this.rls = this.decoding(this.src);
    }

    public String result(String s) {
        return this.rls;
    }

    private String decoding(String s) {
        int count = 0;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                count = count * 10 + c - 48;
            } else {
                while(count > 0) {
                    result.append(c);
                    --count;
                }
            }
        }

        return result.toString();
    }
}
