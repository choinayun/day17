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
		// Ŭ���� Ÿ������ ���� // �� ��ϸ��� ������ ��ü�� ����
		// get �ϸ� ������ ��ü�� ���������´� 
		
		int age;
		String name;
		
		while(true) {
			
			System.out.println("1. ��� 2. ��� 3. �˻�");
			int num = input.nextInt();
			
			switch(num) {
				case 1 : 
					StInfo s = new StInfo();
					
					System.out.println("�̸� �Է�");
					name = input.next();
					System.out.println("���� �Է�");
					age = input.nextInt();
					
					// �������� ȸ�� ���� ���� 
					s.setName(name); s.setAge(age); 
					
					arr.add(s); 
					
					break;
					
				case 2 : 
					
					for(int i = 0; i < arr.size(); i++) {
						StInfo ss = arr.get(i);
						System.out.println("�̸� : " + ss.getName());
						System.out.println("���� : " + ss.getAge());
						System.out.println("--------------");
					}
					
					/*
					StInfo ss = arr.get(0); // StInfo ���������� �޾ƾ� ���� �߻� ���� 
					System.out.println("�̸� : " + ss.getName());
					System.out.println("���� : " + ss.getAge());
					
					ss = arr.get(1);
					System.out.println("�̸� : " + ss.getName());
					System.out.println("���� : " + ss.getAge());
					*/
					break;
					
				case 3 : 
					
					System.out.println("ã�� �̸� �Է�");
					name = input.next();
					
					int i = 0;
					
					for( ; i < arr.size(); i++) {
						StInfo st = arr.get(i);
						if(st.getName().equals(name)) {
							System.out.println("�̸� : " + st.getName());
							System.out.println("���� : " + st.getAge());
							break;
						}	
					}
					
					if(i == arr.size()) {
						System.out.println("ã�� ������ �����ϴ�");
					}
					
					/*
					for(StInfo st : arr) {
						if(st.getName().equals(name)) {
							System.out.println("�̸� : " + st.getName());
							System.out.println("���� : " + st.getAge());
						}
					}*/
					
					break;
			}
		}
	}
}















