package org.techit.Programmas;

public class secertM {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        for (int i=0; i<n; i++){
            String binaryString = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i]|arr2[i])));
            binaryString = binaryString.replace('1', '#').replace('0', ' ');
            if(i==0)System.out.printf("[\"");
            else System.out.printf("\"");
            System.out.print(binaryString);
            if(i<n-1)System.out.printf("\", ");
            else System.out.printf("\"]");
        }
        return answer;
    }

    public static void main(String[] args) {
        secertM secertMap = new secertM();
        int[]arr1 ={9,20,28,18,11};
        int[]arr2 ={30, 1, 21, 17, 28};
        secertMap.solution(5,arr1,arr2);
    }

}
