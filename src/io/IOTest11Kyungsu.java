package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IOTest11Kyungsu {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("* 내용을 입력하세요 (종료는 새 행에서 Enter)");
//		StringBuffer str = getInput();
//		File file = setFileName();
//		save(str, file);
		
		ArrayList<String> list = getInput();
		File file = setFileName();
		save(list, file);
	}

	private static ArrayList<String> getInput() {
//		StringBuffer str = new StringBuffer();
		ArrayList<String> list = new ArrayList<>();
		int line = 1;
		String temp = "";
		
		while(true) {
			System.out.print(line + " : ");
			temp = in.nextLine();
			if(temp.isEmpty()) {
				System.out.println("입력 종료");
				break;
			}
			
			list.add(temp);
			
			temp = null;
			line++;
		}
		
		return list;
	}
	private static File setFileName() {
		File file = null;
		
		System.out.print("저장하시겠습니까? (y/n) ");
		String save = in.next();
		if(save.equalsIgnoreCase("n")) {
			System.exit(0);
		}
		
		String name;
		while(true) {
			System.out.print("파일명 : ");
			name = in.next();
			file = new File(name);
			
			if(!file.isFile())
				break;
			
			System.out.println("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) ");
			save = in.next();
			if(save.equalsIgnoreCase("y"))
				break;
		}
		
		return file;
	}
	private static void save(ArrayList<String> list , File file) {
		FileWriter out = null;
		
		try {
			out = new FileWriter(file);
		} catch (Exception e) {
			System.out.println("파일 생성에 실패하였습니다.");
		}
		
		try {
			for (String str : list) {
				out.write(str);
				out.write("\n");
			}
		} catch (IOException e) {
			System.out.println("파일 저장에 실패하였습니다.");
		}
		
		System.out.println(file.getName() + " 파일이 저장되었습니다.");
		try {
			out.close();
		} catch (IOException e) {
			System.out.println("파일 닫기 실패");
		}
	}
}
