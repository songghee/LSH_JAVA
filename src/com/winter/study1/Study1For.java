package com.winter.study1;

import java.util.Scanner;

public class Study1For{
	
	public static void main(String [] args) {
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하세요");
		
		int num = sc.nextInt();
		
		//입력받은 정수의 약수를 출력하세요
		//for(초기식;조건식;증감식){}
		for(int i=1;i<num; i++) {
			if(num%1==0) {
				System.out.println(i);
			}
			
		}
	}
	

}
