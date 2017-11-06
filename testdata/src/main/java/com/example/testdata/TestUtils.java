package com.example.testdata;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestUtils {

    public  String convertToString(String fileName) {
        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in;
        try {
            in = new InputStreamReader(is, "UTF-8");
            for (; ; ) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0)
                    break;
                out.append(buffer, 0, rsz);
            }
            return out.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
