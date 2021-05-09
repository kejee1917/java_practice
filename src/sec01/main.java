package sec01;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Student st1 = new Student("강은지", "12345");
		Student st2 = new Student("강현지", "13454");
		Student st3 = new Student("강민구", "11236");
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		Scanner kb = new Scanner(System.in);
		
		while(true) { 
			System.out.println("계속 검색하시려면 y 종료하고 싶으면 n");
			String input = kb.nextLine();
			boolean flag = false;
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다");
				System.out.print("학생이름> ");
				String name = kb.nextLine();
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당학생 학번은 : " + stu.getNo());
						flag = true;
					}
				} 
				if(!flag) {
					System.out.println("없는 학생");
				}
			}else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("종료");
		
	}

}
