package sec03;

public class LineDraw {
	public static void main(String[] args) {
		
		int a = 1;  
		int b = 3;
		
		for(int y=0; y<10; y++) {
			for(int x=0; x<10; x++) {
				if(y == a*x + b) {
				System.out.print("0");
				}else {
					System.out.print(" ");
			}
		}System.out.println();
		}
	}
}
