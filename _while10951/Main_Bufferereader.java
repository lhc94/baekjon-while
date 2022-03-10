package _while10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// split과 StringTokenizer 차이
// split은 무작위 구분자들을 한번에 처리 가능함 / 토큰클래스는 한 문자열에 한가지의 구분자들만 처리가능
// split은 구분자들 걸러내고 '배열'에다가 값을 넣어야함(리턴해야함)
// 토큰은 String으로 찢어주기만하고 .nextToken메서드를 반복문을 사용해 각 문자들을 뽑아내고
// StringBuilder 통해 붙여야함
public class Main_Bufferereader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb =  new StringBuilder();
		
		while(br.readLine() != null) {
			st = new StringTokenizer(br.readLine()," ");
			// 키보드로 입력한 값중에 공백은 다 제거
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// nextToken : A,B,C 이면 A확인하고 다시 while처음부터
			// A제거하고 B 확인 다시 while 처음부터
			// A,B제거하고 C 확인
			sb.append((a + b)).append("\n");
			
		}
		System.out.println(sb);
	}
}
