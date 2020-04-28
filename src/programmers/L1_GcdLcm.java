package programmers;

public class L1_GcdLcm {

	class Solution {
		public int[] solution(int n, int m) {
			int[] answer = new int[2];

			answer[0] = gcd(n, m);
			answer[1] = (n * m) / answer[0];

			return answer;
		}

		int gcd(int a, int b) {
			if (b == 0)
				return a;
			return gcd(b, a % b);
		}
	}

}