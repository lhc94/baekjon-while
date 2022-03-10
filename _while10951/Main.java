package _while10951;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a, b, result;
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			result = a + b;
			
			System.out.println(result);
			
		}
		sc.close();
	}
}
