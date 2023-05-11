package org.techit.week4.day4;

import org.techit.week2.Student;

import java.util.*;

class Mountin {
    String IorD;
    int number;
    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getIorD() {
        return IorD;
    }

    public void setIorD(String iorD) {
        IorD = iorD;
    }

    public Mountin(String iorD, int number, String name) {
        this.name = name;
        this.number = number;
        IorD = iorD;
    }
}


public class CoduUp3108 {
    private List<Mountin> mountList = new ArrayList<>();

    public boolean isSame(Mountin mount) { // 같이 숫자가 있으면 중복체크
        for (Mountin mountin : mountList) {
            if (mount.getNumber() == mountin.getNumber()) return true;
        }
        return false;
    }

    public Mountin newMountin(String IorD, int number, String name) {
        return new Mountin(IorD, number, name);
    }
    public void addAStudent(Mountin mountin){
        if(!isSame(mountin)){
            mountList.add(mountin);
        }
    }
    public void deleteMountin(Mountin pMountin){
        for(int i=0; i<mountList.size(); i++){
            if(isSame(mountList.get(i))) mountList.remove(i);
        }
    }

    public void printMountin() {
        for(Mountin mountin : mountList){
            System.out.printf("%s %d %s\n",mountin.IorD,mountin.number,mountin.name);
        }
    }

    private  void printSpecificMountin(int[] arr){
        Collections.sort(mountList, new Comparator<Mountin>() {
            @Override
            public int compare(Mountin o1, Mountin o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });

        for (int i = 0; i < arr.length; i++){
            Mountin mountin = mountList.get(arr[i]-1);
            System.out.printf("%s %d %s", mountin.getIorD(), mountin.getNumber(), mountin.getName());
        }
    }
    public void process(Mountin mountin){
        switch (mountin.getIorD()){
            case "I" -> addAStudent(mountin);
            case "D" -> deleteMountin(mountin);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 1;

        CoduUp3108 codeUp3108 = new CoduUp3108();
        for (int i = 0; i <4; i++) {
            String IorD = sc.nextLine();
            String name = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            Mountin mountin = codeUp3108.newMountin(IorD, number, name);
            codeUp3108.process(mountin);
        }

        codeUp3108.printSpecificMountin(new int[]{1,2,3});

    }
}
