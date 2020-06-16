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

//     프로그래머스 코드.. 참고
//    class Solution {
//        class Tower {
//            int idx;
//            int height;
//
//            public Tower(int idx, int height) {
//                this.idx = idx;
//                this.height = height;
//            }
//
//            @Override
//            public String toString() {
//                return "idx : " + idx + " height : " + height;
//            }
//        }
//
//        public int[] solution(int[] heights) {
//            Stack<Tower> st = new Stack<>();
//            int[] answer = new int[heights.length];
//
//            for (int i = 0; i < heights.length; i++) {
//                Tower tower = new Tower(i + 1, heights[i]);
//                int receiveIdx = 0;
//
//                while (!st.isEmpty()) {
//                    Tower top = st.peek();
//
//                    if (top.height > tower.height) {
//                        receiveIdx = top.idx;
//                        break;
//                    }
//
//                    st.pop();
//                }
//
//                st.push(tower);
//                answer[i] = receiveIdx;
//            }
//
//            return answer;
//        }
//    }
}
