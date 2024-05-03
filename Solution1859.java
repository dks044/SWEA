package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            long[] prices = new long[N];
            for (int i = 0; i < N; i++) {
                prices[i] = sc.nextLong();
            }

            long maxPrice = 0;
            long profit = 0;
            int length = prices.length;
            // 뒤에서부터 시작하여 현재까지의 최고가를 갱신
            for (int i = length - 1; i >= 0; i--) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i]; // 최고가 갱신
                } else {
                    profit += maxPrice - prices[i]; // 이득 계산
                }
            }

            System.out.println("#" + test_case + " " + profit);
        }
    }
}

