package test.tasks.simple;

public class SearchString {
    public String find(String subStr, String str) {
        for (int i = 0; i < str.length() - subStr.length() + 1; ++i) {
            boolean found = true;
            for (int j = 0; j < subStr.length(); ++j) {
                if ((subStr.charAt(j) != str.charAt(i + j))) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return "The string HAS a substring";
            }
        }

        return "String does NOT have the substring";
    }
}
