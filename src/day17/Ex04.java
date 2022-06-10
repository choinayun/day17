package day17;

import java.util.ArrayList;
import java.util.Scanner;

class StInfo{
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		// 클래스 타입으로 지정 // 한 블록마다 각각의 객체가 들어가서
		// get 하면 각각의 객체가 꺼내져나온다 
		
		int age;
		String name;
		
		while(true) {
			
			System.out.println("1. 등록 2. 출력 3. 검색");
			int num = input.nextInt();
			
			switch(num) {
				case 1 : 
					StInfo s = new StInfo();
					
					System.out.println("이름 입력");
					name = input.next();
					System.out.println("나이 입력");
					age = input.nextInt();
					
					// 여러명의 회원 저장 가능 
					s.setName(name); s.setAge(age); 
					
					arr.add(s); 
					
					break;
					
				case 2 : 
					
					for(int i = 0; i < arr.size(); i++) {
						StInfo ss = arr.get(i);
						System.out.println("이름 : " + ss.getName());
						System.out.println("나이 : " + ss.getAge());
						System.out.println("--------------");
					}
					
					/*
					StInfo ss = arr.get(0); // StInfo 변수값으로 받아야 오류 발생 안함 
					System.out.println("이름 : " + ss.getName());
					System.out.println("나이 : " + ss.getAge());
					
					ss = arr.get(1);
					System.out.println("이름 : " + ss.getName());
					System.out.println("나이 : " + ss.getAge());
					*/
					break;
					
				case 3 : 
					
					System.out.println("찾을 이름 입력");
					name = input.next();
					
					int i = 0;
					
					for( ; i < arr.size(); i++) {
						StInfo st = arr.get(i);
						if(st.getName().equals(name)) {
							System.out.println("이름 : " + st.getName());
							System.out.println("나이 : " + st.getAge());
							break;
						}	
					}
					
					if(i == arr.size()) {
						System.out.println("찾는 정보가 없습니다");
					}
					
					/*
					for(StInfo st : arr) {
						if(st.getName().equals(name)) {
							System.out.println("이름 : " + st.getName());
							System.out.println("나이 : " + st.getAge());
						}
					}*/
					
					break;
			}
		}
	}
}















