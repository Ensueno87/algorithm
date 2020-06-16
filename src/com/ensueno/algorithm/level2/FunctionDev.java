package com.ensueno.algorithm.level2;

import java.util.*;

public class FunctionDev {
    public int[] solution(int[] progresses, int[] speeds) {

        //프로그래머스.. 코드.. 아직 멀었구만..
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }

    //내가 푼 풀이
//    public int[] solution(int[] progresses, int[] speeds){
//        int[] answer = {};
//
//        Queue<Integer> queue = new LinkedList<>();
//
//        for(int i=0; i<progresses.length; i++){
//            queue.add((100 - progresses[i]) / speeds[i]);
//        }
//
//        List<Integer> retList = new ArrayList<>();
//        int count = 1;
//        int standard = queue.poll();
//        while(!queue.isEmpty()){
//            int num = queue.poll();
//            if(standard >= num){
//                count++;
//            }else{
//                retList.add(count);
//                count = 1;
//                standard = num;
//            }
//        }
//        retList.add(count);
//        return retList.stream().mapToInt(i->i).toArray();
//    }
}
