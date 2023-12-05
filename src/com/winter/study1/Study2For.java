package com.winter.study1;

import java.util.Scanner;

public class Study2For {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		//아이디와 패스워드를 입력받는다.
		//로그인 성공 유무 판단
		
//		int k=10;
//		int m =10;
//		int total = k+m
		
		boolean check=false; //false면 로그인 실패
		String result="로그인 실패";
		for (int i=0; i<5;i++) {
			System.out.println("ID 입력.");
			int youId=sc.nextInt();
			System.out.println("PW 입력.");
			int youPw=sc.nextInt();
			if(youId==id && youPw==pw) {
//				if(pw==5678) {
//					System.out.println("로그인 되었습니다.");
				result="로그인 성공";
					check=true;
					//check=!check;
					break;
			}
		}
		System.out.println(result);
		
//		if(check) {
//			System.out.println("로그인 되었습니다.");
//				}else {
//					System.out.println("로그인 실패.");
//				}
			}
		}
		

