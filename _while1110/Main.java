package _while1110;

import java.util.Scanner;

// A변수에다 int 값 입력한다 -> 10의 자리수와 일의 자리수를 더한다 더한값을 result라 한다
// 이전의 일의자리 수를 10의 자리수로 result값을 일의자리수로 만든다
// A변수와 result값이 같을 때까지 계속 싸이클 돌린다 같으면 끝

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("처음 값 : ");
		
		int a = sc.nextInt();
		
		int cnt = 0, ten = 0, one = 0;
		int result = a;
		
		while(true) {
			
			cnt++;
			
			ten = result / 10;
			System.out.println(ten);
			// 1의 자릿 수
			one = result % 10;
			System.out.println(one);
			
			result = one * 10 + (ten + one) % 10;
			
			if(a == result) {
				break;
			}
		}
		
		System.out.println(cnt);
		sc.close();
		
	}
}
