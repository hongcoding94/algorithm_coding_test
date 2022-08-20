/**
 * 등록 번호 : 1110번  
 * 등록 제목 : 더하기 사이클
 * 현재 상태 : 완료 ✔️
 */

/** 내가 생각한 방식
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.  0△ 99▽
 * 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
 * n1 == 10 
 * 1  == 01 + 6  = 7
 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 * 26 = 2+6(8) = 6+8(14) = 8+4(12) = 4+2(6) = 2+6
 * 
 * 55 = 5+5(10) = 0+5(5) = 5+5(10) = 5+5
 * 
 * 1  = 1	2	3	4	5	6	7	8	9	10
 * 1	0+1	1+1	1+2	2+3	3+5	5+8	8+3	3+1	1+4	4+5
 * 2	5+9	9+4	4+3	3+7	7+0	0+7	7+7	7+4	4+1	1+5
 * 3	5+6	6+1	1+7	7+8	8+5	5+3	3+8	8+1	1+9	9+0
 * 4	0+9	9+9	9+8	8+7	7+5	5+2	2+7	7+9	9+6	6+5
 * 5	5+1	1+6	6+7	7+3	3+0	0+3	3+3	3+6	6+9	9+5
 * 6	5+4	4+9	9+3	3+2	2+5	5+7	7+2	2+9	9+1	0+1
 * 
 * 0  = 0+0(0) = 0
 * 
 * 71 = 7+1(8) = 1+8(9) = 8+9(17) = 9+7(16) = 7+6(13) = 6+3(9) = 3+9(12) = 9+2(11) = 2+1(3) = 1+3(4) = 3+4(7) = 4+7(11) = 7+1(8)
 */

import java.util.Scanner;
 
public class BoJ1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		in.close();
		int cnt = 0;
		int copy = N;
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
