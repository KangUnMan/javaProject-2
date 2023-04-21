package org.techit.codeup;

import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp41 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);

        char ASC = (char) is.read();

        System.out.printf("%c",ASC+1);

    }
}
