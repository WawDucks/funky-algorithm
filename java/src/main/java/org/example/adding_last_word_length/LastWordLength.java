package org.example.adding_last_word_length;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
}
