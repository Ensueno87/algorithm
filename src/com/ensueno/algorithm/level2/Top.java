package com.ensueno.algorithm.level2;

import java.util.Stack;

public class Top {
    public int[] solution(int[] heights){
        int[] answer = {};

        Stack<Integer> top = new Stack<>();

        for(int i=0; i<heights.length; i++){
            top.push(heights[i]);
        }

        answer = new int[heights.length];

        while(!top.isEmpty()){
            int n = top.pop();
            int count=0;

            for(int j=top.size(); j>= 1; --j){
                System.out.println("n=" + n + "m=" + heights[j-1]);
                if( n < heights[j-1]){
                    answer[top.size()] = top.size()-count;
                    break;
                }
                count++;
            }

        }

        return answer;
    }
}
