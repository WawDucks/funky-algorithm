package org.example;

import org.example.adding_last_word_length.LastWordLength;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastWordLengthTest {
    @Test
    public void valid() {
        Assertions.assertEquals(5, LastWordLength.lengthOfLastWord("Hello World"));
        Assertions.assertEquals(4, LastWordLength.lengthOfLastWord("   fly me   to   the moon  "));
        Assertions.assertEquals(6, LastWordLength.lengthOfLastWord("luffy is still joyboy"));
    }
}