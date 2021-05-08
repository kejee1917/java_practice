package sec03;

public class PickNum {
	public static void main(String[] args) {
		
		String str = "93jeon92kang";
		
		for(int i=0; i<str.length(); i++) {
			char num = str.charAt(i);  //char타입 
			if('0' <= num && num <= '9') {   //정수라면~이라는 뜻
				System.out.print(num);
			}
		}
	}
}
