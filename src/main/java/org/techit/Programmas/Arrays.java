package org.techit.Programmas;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        solution8.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2});
    }
}


class Solution8 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer>list = new ArrayList<Integer>();
        List<Integer> subList;
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int j=0; j<query.length; j++){
            if(query[j]%2==0){
                for(int k=list.size(); k==query[j]; k--){
                    list.remove(list.size()-1);
                }
            }else if(query[j]%2!=0){
                for(int k=list.size(); k==query[j]; k--){
                    list.remove(list.size()-1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}