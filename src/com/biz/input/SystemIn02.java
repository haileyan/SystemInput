package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = System.in;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(input);
		
		// Prompt:
		// nextLine()를 실행하기 전에
		// 무엇을 해야할 지 알려주는 메세지를 먼저 출력하라.
		
		System.out.println("영문자열을 입력 후 Enter....");
		String strInput = scanner.nextLine();
		System.out.println(strInput);
		
		
	}

}
