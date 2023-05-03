package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class IOTest6 {
//main에서 Exception 하면 아예 Exceptio 처리 안하겠다는 의미
	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
		FileOutputStream out = null;
		int i;
		String inFilename, outFilename;
		File inFile, outFile;
		Scanner sc = new Scanner(System.in);
		
		//원본 파일
		//1 바이트씩 읽기
		System.out.println("원본 파일명: ");
		inFilename = sc.nextLine();
		inFile = new File(inFilename);
		if(!inFile.isFile()) {
			System.out.println(inFilename + "파일이 없습니다.");
			return;
		}
		in = new FileInputStream(inFilename);
		
		//대상 파일
		System.out.println("사본 파일명:");
		outFilename = sc.nextLine();
		outFile = new File(inFilename);
		if(outFile.isFile()) {
			System.out.println("이미 존재하는 파일명입니다. 덮어쓰기 (y/n)");
			if(sc.nextLine().equalsIgnoreCase("n"))
				return;
		}
		out = new FileOutputStream(outFilename);
		
		/*i = in.read(); //1바이트 읽어오기
		out.write(i); //원본으로부터 1바이트 받아서 쓰기*/
		while ((i= in.read()) != -1) {
			out.write(i);
		}
		
		in.close();
		out.close();
	}

}
