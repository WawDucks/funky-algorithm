package org.example.count_and_say;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n < 0) {
            return "";
        }

        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            char current = result.charAt(0);
            int counter = 1;
            for (int j = 1; j < result.length(); j++) {
                if (current == result.charAt(j)) {
                    counter++;
                }else {
                    sb.append(counter).append(current);
                    current = result.charAt(j);
                    counter = 1;
                }
            }
            sb.append(counter).append(current);
            result = sb.toString();
        }
        return result;
    }
}
