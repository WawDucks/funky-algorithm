package org.example;

import org.example.designer_pdf_viewer.DesignerPdfViewer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DesignerPdfViewerTest {
    @Test
    public void testDesignerPdfViewer() {
        // Test case 1
        List<Integer> heights2 = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7);
        String word2 = "zaba";
        Assertions.assertEquals(28, DesignerPdfViewer.designerPdfViewer(heights2, word2));
    }
}