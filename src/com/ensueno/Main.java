package com.ensueno;

import com.ensueno.algorithm.level2.FunctionDev;
import com.ensueno.algorithm.level2.Top;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FunctionDev functionDev = new FunctionDev();
        int[] progress = {93, 30, 55};
        int[] speed = {1, 30, 5};
        System.out.println(Arrays.toString(functionDev.solution(progress, speed)));

        Top top = new Top();
        int[] heights = {1, 5, 3, 6, 7, 6, 5};
        System.out.println(Arrays.toString(top.solution(heights)));
    }
}
