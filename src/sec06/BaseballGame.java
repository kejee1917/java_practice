package sec06;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com[] = new int[3];
		int user[] = new int[3];
		boolean replay = true;
		while(replay) {
			int r = 0;
			int x = 0;
			int chance = 0;
			boolean flag = false; 
			boolean swit[] = new boolean[10]; //0~9
			//컴퓨터 숫자 3개 랜덤(단, 중복되지 않게)
			while(x < 3) {  //셔플 
				r = (int) (Math.random()*10); //0~9
				if(swit[r] == false) {
					swit[r] = true;
					com[x] = r + 1; //1~10
					x++;
				}
			}
			for(int i=0; i<com.length; i++) {
				System.out.println((i+1) + "번째 숫자> " + com[i]);
			}
			//유저 숫자 3개 입력(중복되지 않게, 기회는 10번)
			
			while(chance<10) {
				while(true) {
					System.out.println("user! 숫자 입력하세요.");
					for(int i=0; i<user.length; i++) {
						System.out.print((i+1) + "번째 숫자> ");
						user[i] = sc.nextInt();
					}
					if(user[0] != user[1] && user[0] != user[2] && user[1] != user[2]) {
						break;
					}else {	
						System.out.println("중복 숫자 있음. 다시 입력하세요.");
					}
				}
				
				//검사(스트라이크,볼)
				int strike = 0;
				int ball = 0;
				for(int i=0; i<com.length; i++) { //0,1,2
					for(int j=0; j<user.length; j++) { //0,1,2
						if(com[i] == user[j] && i == j) {
							strike++;
						}else if(com[i] == user[j]) {
							ball++;
						}
					}
				}
				System.out.println(strike + "스트라이크" + ball + "볼");
				chance++;
				System.out.println("잔여 기회 > " + (10-chance) );
				//메시지
				if(strike == 3) {
					flag = true;
					break;
				}			
			}
			if(flag == true) {
				System.out.println("게임 승리! 다시 재도전? y/n");
			}else {
				System.out.println("게임 오버~ 다시 재도전? y/n");
			}
			String key = sc.next();
			if(key.equals("y")) {
				replay = true;
			}else if(key.equals("n")) {
				replay = false;
			}
		}
		System.out.println("게임 완전 종료");
	}
}

