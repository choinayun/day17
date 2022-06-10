package day17;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		
		// for each 문 
		
		String[] str = {"111", "222", "333"}; 
		for(int i = 0; i < str.length; i++) {
			System.out.println( str[i] );
		}
	
		for(String s : str) {
			// str의 값이 String 이기 때문에 
			// 배열 속의 값이 순차적으로 s 에 들어간다 
			
			System.out.println( s );
		}
		
		System.out.println("----------------");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(111);
		arr.add(2);
		arr.add(333);
		
		for(int a : arr) {
			System.out.println( a );
		}
		
		int i = 0;
		for ( ; i < arr.size(); i++) {
			if(arr.get(i) == 2) {
				System.out.println("찾았다");
				break;
			}
		}
		System.out.println("i : " + i);
		System.out.println("arr.size : " + arr.size());
	}
}
