package sec03;

import java.util.Scanner;

public class UpAndDownGame {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); {
		System.out.println("업앤다운 게임을 시작합니다.");
		System.out.println("범위는 아래 제공");
			int call;
			int min = 1;
			int max = 999;
			String answer = "";
				
		while(true) {
			System.out.println(min + "~" + max);
			call = (min + max) / 2; 
			System.out.println(call + "정답은 위에있나요? 아래에 있나요?");
			answer = kb.nextLine();
				if(answer.equals("업")) {   //참조타입(String)은 비교연산자 (==)사용할수 없음.
					System.out.println("정답은 그것보다 더 큰 숫자입니다.");
					min = call;
				}if(answer.equals("다운")) {
					System.out.println("정답은 그것보다 더 작은 숫자입니다.");
					max = call;
				}if(answer.equals("정답")) {
					System.out.println("정답입니다.");
					break;
				} 
			}
		}
	}
}
