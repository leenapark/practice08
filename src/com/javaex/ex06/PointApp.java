package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		/*
		 *false / false / false / true / false / true
		 *pn의 실제 값이 바로 들어가는 게 아니라
		 *주소값이 들어가는 것이므로 p1과 p2는 값이 같아도 같은 주소를 가지고 있지 않는다 - false
		 *p1과 p4 는 p4가 p1의 주소값을 가지고 있으므로 같은 주소를 가지고 있다 - true
		 */
	}

}


