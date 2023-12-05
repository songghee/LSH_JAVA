package com.winter.study1;

import java.util.Scanner;

public class Study3For {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//구구단
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10;j++) {
//				System.out.println(i+"*"+j+"="+i+j);
//			}
//		}
		
		//0-59분
		//0-59초
		////1분5초
		//분 초 입력
		
		int min=1;
		int sec=5;
		
		//반복문 종료 방법
		//1. break를 만났을때
		//2. 조건식이 false일때
		
		boolean flag=false;
		for(int m=0; m<60; m++) {
			for(int s =0; s<60; s++) {
				System.out.println(m+"분"+s+"초 입니다");
				if(min==m &&sec==s) {
					flag=!flag;
					m=100;
					break;
				}
			}
//			if(flag) {
//				break;
//			}
		}

	}

}
