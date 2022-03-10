package _while10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
//		토큰 : 구분자 를 기준으로 나뉘어 있는 문자열 정보 => 88 : 11  88과 11로 읽을 었다면 그건 클론을 
// 		구분자로 인식했기 때문이고 88과 11은 각 토큰이다.
		
		StringBuilder sb = new StringBuilder();
		
//		StringBuiler : 기존의 데이터에 더하는방식 -> 부하가 적다
		
//		String A, B
//		A = A + B 하면 새로운 메모리 할당을하며  기존의 A메모리는 쓰레기가 되어 
//		이것이 쌓이면 부하생기는게 문제이다
//		이것을 해결하기위해 나온것이 StringBuiler이다
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A == 0 && B == 0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
}
