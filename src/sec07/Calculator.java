package sec07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1, num2, oper;
		//첫번째 수 (문자가 포함이면 다시입력)
		while(true) {
			System.out.print("첫번째 숫자> ");
			num1 = sc.nextLine();
			boolean flag = false;
			if(num1 == "") {
				System.out.println("공백을 입력했습니다. 숫자를 입력하세요.");
				continue;
			}
			for(int i=0; i<num1.length(); i++) {
				char ch = num1.charAt(i);
				if(ch < '0' || ch > '9') {
					flag = true;
				}
			}
			if(flag == true) {
				System.out.println("숫자만 입력하세요 > ");
			}else {
				break;
			}
		}
		//연산자 (다른 문자가 입력이 되었나? 다시입력)
		System.out.print("어떤 연산을 하시겠습니까? ( +, -, *, / ) > ");
		
		while(true) {
			oper = sc.nextLine();
			if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
				System.out.println("입력된 연산 > " + oper);
				break;
			} else {
				System.out.print("연산자만 입력해주세요 > ");
				continue;
			}	
		}
		//두번째 수 ( 연산자가 /이면 0일때 다시 입력)
		while(true) {
			System.out.print("두번째 숫자> ");
			num2 = sc.nextLine();
			boolean flag = false;
			if(num2 == "") {
				System.out.println("공백을 입력했습니다. 숫자를 입력하세요.");
				continue;
			}else if(oper.equals("/") && num2.equals("0")) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
				continue;
			}
			for(int i=0; i<num2.length(); i++) {
				char ch = num2.charAt(i);
				if(ch < '0' || ch > '9') {
					flag = true;
				}
			}
			if(flag == true) {
				System.out.println("숫자만 입력하세요 > ");
			}else {
				break;
			}
		}		
		//문자열을 숫자로
		System.out.println(num1 + " " + oper + " " + num2 + " = " + "?" );
		int n1 = Integer.parseInt(num1);	
		int n2 = Integer.parseInt(num2);
		//연산
		switch(oper) {
		case "+" :
			System.out.println("연산 결과 > " + (n1 + n2));
			break;
		case "-" :
			System.out.println("연산 결과 > " + (n1 - n2));
			break;
		case "*" :
			System.out.println("연산 결과 > " + (n1 * n2));
			break;
		case "/" :
			System.out.println("연산 결과 > " + (n1 / n2));
			break;
		}
	}
}


