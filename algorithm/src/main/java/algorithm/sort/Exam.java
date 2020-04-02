package algorithm.sort;

public class Exam {

	public static void main(String[] args) {
		/**
		 * @문제
		 	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

			1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, // 1, 2, 3, 4, 5, ...
			2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, //  2, 1, 2, 3, 2, 4, 2, 5, ...
			3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, // 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

			1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
		 */
		int[] exam = {1,2,3,4,5};

		int[] m = new int[3];
        int[] supo1 = { 1, 2, 3, 4, 5 };
        int[] supo2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] supo3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        for (int i = 0; i < exam.length; ++i) {
            if (exam[i] == supo1[i % 5]) {
                ++m[0];
            } 
            if (exam[i] == supo2[i % 8]) {
                ++m[1];
            }
            if (exam[i] == supo3[i % 10]) {
                ++m[2];
            }
        }
        int maxScore = Math.max(m[0], Math.max(m[1], m[2]));
        System.out.println(maxScore);
		
	}
}
