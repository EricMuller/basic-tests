package com.emu.tests.exercices.codegame;

import java.util.HashMap;
import java.util.Map;

public class MimeType {

    static void distClosestNumbers(String files[]) {


        Map <String, String> map = new HashMap();
        map.put("pdf", "application/pdf");
        map.put("doxc", "application/word".toLowerCase());

        for (String fileName : files) {
            int pos = new StringBuilder(fileName).reverse().toString().indexOf(".");
            String mimeType = "UNKNOWN";
            if (pos > 0) {
                String ext = fileName.substring(fileName.length() - pos ).toLowerCase();
                if (map.containsKey(ext)) {
                    mimeType = map.get(ext);
                }
            }

            System.out.println(mimeType);
        }

    }

    public static void main(String[] args) {
        String files[] = {
                "tutu.image.pdf", "rrro.gif","."
        };
        distClosestNumbers(files);

    }
}
