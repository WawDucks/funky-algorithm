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
                } else {
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

    public static String countAndSayRecursive(int n) {
        if (n < 0) {
            return "";
        } else if (n == 1) {
            return "1";
        } else {
            String previous = countAndSayRecursive(n - 1);
            StringBuilder sb = new StringBuilder();
            char current = previous.charAt(0);
            int counter = 1;
            for (int i = 1; i < previous.length(); i++) {
                if (current == previous.charAt(i)) {
                    counter++;
                } else {
                    sb.append(counter).append(current);
                    current = previous.charAt(i);
                    counter = 1;
                }
            }
            sb.append(counter).append(current);
            return sb.toString();
        }
    }
}
