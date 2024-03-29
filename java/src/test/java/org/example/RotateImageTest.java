package org.example;

import org.example.rotate_image.RotateImage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertArrayEquals(expected, matrix);
    }
}