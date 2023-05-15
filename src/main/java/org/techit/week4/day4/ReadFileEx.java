package org.techit.week4.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadFileEx {

    public List<String> getLines(String fileName) { //주소값을 받아 문자열로 반환해주는 메소드
        List<String> lines = new LinkedList<>();
        try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName),StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine())!= null){
                lines.add(line);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    public  Hospital parse(String str){ //받은 문자열을 split을 이용해 배열 넣은뒤 Hospital 객체에 보내야할 값들에 분배해준다.
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10],splitted[5],splitted[7]);
        Hospital hospital = new Hospital(splitted[1],splitted[11],address);  //병원이름 , 사이트주소 , 주소

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) { //값들이 들어간 리스트인 lines를 매개변수로 받고 그값들을 위에
        // 메소드로 값들을 넣어 hospital을 반환 받은뒤 Hospital 객체들이 모인 리스트인 hospitals에 넣는다.
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines){
           hospitals.add(parse(line));
        }
        return hospitals;
    }
    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx();
        List<String> strLines = rfe.getLines("C:\\git\\java\\javaProject-2\\hospitalInfo.txt");
        /*for (int i = 0; i < 9; i++) {
            System.out.println(result.get(i));
        }*/
       List<Hospital> parsedHospital = rfe.getHospitals(strLines);
        System.out.println(parsedHospital.get(1).getWebsiteAddr()); // 그중에 하나인 1번 병원의 웹사이트를 출력하였다.

    }
}

