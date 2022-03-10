package _while10952;

import java.util.Scanner;

// 10952번 A+B - 5
// while문

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Resource leak: 'sc' is never closed 경고
		// close를 해주어야함 안그러면 데이터가 쌓임
		while(true) {
			
			int A, B;
		
			A = sc.nextInt();
		
			B = sc.nextInt();
		
			if(A == 0 && B == 0) {
				sc.close();
				break;
			}
			
//			sc.close();
//			java.lang.IllegalStateException: Scanner closed
//			반복문인데 close로 닫아버리니까 system.in도 닫혀버려서 그 다음 반복문에 문제가 생긴다
//			nextLine과 차이점은
//			nextLine메소드는 Enter를치 기 전까지 쓴 문자열을 모두 리턴
//			next메서드는 공백 전까지 입력 받은 문자열을 리턴함
			
			int result = A + B;
			
			System.out.println(result);
			
		}
		
	}
}
