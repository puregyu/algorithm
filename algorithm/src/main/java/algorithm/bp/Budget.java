package main.java.algorithm.bp;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        // 이분탐색 문제

//        국가의 역할 중 하나는 여러 지방의 예산요청을 심사하여 국가의 예산을 분배하는 것입니다.
//        국가예산의 총액은 미리 정해져 있어서 모든 예산요청을 배정해 주기는 어려울 수도 있습니다.
//        그래서 정해진 총액 이하에서 가능한 한 최대의 총 예산을 다음과 같은 방법으로 배정합니다.
//
//        1. 모든 요청이 배정될 수 있는 경우에는 요청한 금액을 그대로 배정합니다.
//        2. 모든 요청이 배정될 수 없는 경우에는 특정한 정수 상한액을 계산하여 그 이상인 예산요청에는 모두 상한액을 배정합니다.
//        상한액 이하의 예산요청에 대해서는 요청한 금액을 그대로 배정합니다.
//        예를 들어, 전체 국가예산이 485이고 4개 지방의 예산요청이 각각 120, 110, 140, 150일 때,
//        상한액을 127로 잡으면 위의 요청들에 대해서 각각 120, 110, 127, 127을 배정하고 그 합이 484로 가능한 최대가 됩니다.
//        각 지방에서 요청하는 예산이 담긴 배열 budgets과 총 예산 M이 매개변수로 주어질 때,
//        위의 조건을 모두 만족하는 상한액을 return 하도록 solution 함수를 작성해주세요.

        int[] budgets = {120, 110, 140, 150};
        int M = 485;
        int answer = 0;

        Arrays.sort(budgets);
        long sum = 0;
        for (int budget : budgets) sum += budget;

        if (sum <= M) {
            System.out.println(budgets[budgets.length - 1]);
            System.exit(0);
        }

        // 최대값
        int max = budgets[budgets.length - 1];
        System.out.println("최대 예산 : " + max);
        // 최저값
        int min = (int) Math.floor(M / budgets.length);
        System.out.println("최소 예산 : " + min);

        int mid = 0;
        int compareMid = 0;

        while (true) {
            mid = (int) Math.ceil((max + min) / 2);
            System.out.println("중간 값 : " + mid);
            sum = 0;

            for (int i = 0; i < budgets.length; i++) {
                sum += (budgets[i] > mid) ? mid : budgets[i];
            }

            // 상한값이 동일하면 종료
            if (mid == compareMid) {
                answer = mid;
                break;
            }

            if (sum > M) {
                max = mid;
            } else {
                min = mid;
            }
            compareMid = mid;
        }

        System.out.println(answer);

    }
}
