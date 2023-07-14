package org.example.rotate_image;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

    @Test
    public void testRotate() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        RotateImage rotateImage = new RotateImage();

        rotateImage.rotate(matrix);

        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        Assert.assertArrayEquals(expected, matrix);
    }
}