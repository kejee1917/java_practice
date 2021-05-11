package sec07;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int pick;
		int temp;
		//숫자 입력 받기
		System.out.print("몇개를 입력하십니까?");
		input = sc.nextInt();
		int num[] = new int[input];
		while(true) {
			for(int i=0; i<num.length; i++) {
				System.out.print((i+1) + "번째 숫자 > ");
				num[i] = sc.nextInt();
				}
			break;
			}	
		//오름 차순? 내림 차순? 고르고 Sorting(swap)
		System.out.print("오름차순(1)/ 내림차순(2) 선택 > ");
		pick = sc.nextInt();
		if(pick == 1) {
			for(int i=0; i<num.length-1; i++) {
				for(int j=i+1; j<num.length; j++) {
					if(num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
		}else{
			for(int i=0; i<num.length-1; i++) {
				for(int j=i+1; j<num.length; j++) {
					if(num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
		}
		//출력
		System.out.println("결과 > " + Arrays.toString(num));
		}
		
	}


