package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	//메인
    	//사칙 연산만 가능하고 2개의 피연산자를 받는 정수 계산기 만들기
    	
    	Scanner sc = new Scanner(System.in);
    	int result;    	
    	
    	
    	while(true) {
        	System.out.print(">> ");
        	String num = sc.nextLine();
        	
        	if(num.equals("/q")) {
        		System.out.println("종료합니다.");
        		break;
        	}
        	String data[] = num.split(" ");
            
        	int a = Integer.parseInt(data[0]);
        	String c = data[1];
        	int b = Integer.parseInt(data[2]);
            
            switch(c) {
            case "-":
            	Sub sub = new Sub();
            	sub.setValue(a, b);
            	result = sub.calculate();
            	System.out.println(">> " + result);
                break;
            case "+":
            	Add add = new Add();
            	add.setValue(a, b);
            	result = add.calculate();
            	System.out.println(">> " + result);
                break;
            case "/":
            	Div div = new Div();
            	div.setValue(a, b);
            	result = div.calculate();
            	System.out.println(">> " + result);
                break;
            case "*":
            	Mul mul = new Mul();
            	mul.setValue(a, b);
            	result = mul.calculate();
            	System.out.println(">> " + result);
                break;
            default :
                System.out.println("알 수 없는 연산입니다.");
                break;
            }
            
    	}
    	
    	sc.close();

    }
}
