package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class IOTest11 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileWriter out = null;
		String filename;
		File file, tempFile;
		String text;
		int line = 0;
		
		while(true) {
			System.out.println("*내용을 입력하세요 (종료는 새 행에서 Enter)");
			System.out.println(++line + ":");
			text = sc.nextLine();
			if() break;
		}
		
		//파일 저장여부 묻고
		//이름이 이미 존재하는지
		// 있으면 그 이름을 사용할지?
		// 저장 완료
		while(true) {
			System.out.println("파일명: ");
			path = sc.nextLine(); //파일경로 입력받기
			file = new File(path); // 
			if (file.isFile()) break;
			System.out.println(path + " 파일이 없습니다.");
		}
		//파일입력스트림 생성
		in = new FileReader(file);
		
		//반복문으로 내용 읽어서 출력
		while((ch = in.read()) != -1) {
			System.out.println(ch);
		}
		//파일 닫기
	}
}
