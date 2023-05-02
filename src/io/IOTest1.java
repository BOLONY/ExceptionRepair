package io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class IOTest1 {

	public static void main(String[] args) {
		File a = new File("a.txt");
		File b = new File("sub");		
		
		System.out.println(a.exists()); //존재하는지 가리킨다.
		System.out.println(a.isFile()); //파일로 존재하는지
		System.out.println(a.isDirectory()); // 디렉토리로 존재하면 true
		
		
		try {
			a.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		b.mkdir();
		
		System.out.println(a.exists()); //존재하는지 가리킨다.
		System.out.println(a.isFile()); //파일로 존재하는지
		System.out.println(a.isDirectory()); // 
		
		System.out.println();
		File c = new File("C:\\Users\\user\\git\\JAVA_SCIT\\KM_44\\src\\School\\Student.java");
		System.out.println(c.isFile());//디렉토리나 파일이 아닌것
		System.out.println(c.getName());
		System.out.println(c.getParent());
		System.out.println(c.length()); //파일의 용량, 크기 4096byte
		// \있으면 바로 뒤에있는거 묶어서 특수문자인줄 안다.
		
		// \\경로
		System.out.println();
		File d = new File("C:\\Users\\user\\git\\JAVA_SCIT\\KM_44\\src\\School");
		String filenames[] = d.list();// 지정한 경로의 파일명
		
		for (String name : filenames) {
			System.out.println(name);
		}
		System.out.println();
		
		File files[] = d.listFiles();
		
		System.out.println(d.list());
		// 현재 위치 알아내기
		File e = new File(".");
		try {
			System.out.println(e.getCanonicalPath());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// 파일명 변경하기
		File f = new File("a2.txt");
		a.renameTo(f); //f가 가리키는 개체로 변경
		// 파일 삭제하기
		a.delete();
	
		
	}

}
