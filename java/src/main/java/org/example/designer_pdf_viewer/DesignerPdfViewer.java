package org.example.designer_pdf_viewer;

import java.nio.charset.CharsetEncoder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DesignerPdfViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetMap.put(c, c- 'a');
        }

        HashMap<Integer, Integer> heightMap = new HashMap<>();
        for (int i = 0; i < h.size(); i++) {
            heightMap.put(i, h.get(i));
        }

        HashMap<Character, Integer> wordMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            int index = alphabetMap.get(c);
            wordMap.put(c, heightMap.get(index));
        }

        int maxH = Collections.max(wordMap.values());
        return  maxH * word.length();
    }
}
