package org.techit.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferdReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("line = " + br.readLine());
        System.out.println("line = " + br.readLine());
    }
}
