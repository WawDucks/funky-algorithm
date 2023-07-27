package org.example;

import org.example.adding_last_word_length.LastWordLength;
import org.junit.Assert;
import org.junit.Test;

public class LastWordLengthTest {
    @Test
    public void valid() {
        Assert.assertEquals(5, LastWordLength.lengthOfLastWord("Hello World"));
        Assert.assertEquals(4, LastWordLength.lengthOfLastWord("   fly me   to   the moon  "));
        Assert.assertEquals(6, LastWordLength.lengthOfLastWord("luffy is still joyboy"));
    }
}