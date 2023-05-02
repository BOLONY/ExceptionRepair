package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader in = null;
		int ch;
		
		
		//"C:\\Java\\aaa.txt"
		while(true) {
			System.out.print("검색할 파일을 입력하세요: ");
			String search = sc.nextLine();
			File aFile = new File(search);
			//file의 주소를 담기위한 String의 주소
			
			if (aFile.exists()) {
				System.out.println("파일 존재함");
				try {
					in = new FileReader(search);
					} 
				catch (FileNotFoundException e) {
					e.printStackTrace();
					}
				try {
					while((ch = in.read()) != -1) { //파일에서 1문자 읽기
						//읽을 문자가 없으면 -1 반환 키워드
						System.out.print((char)ch); //읽은 문자 출력
					}
				}catch(IOException e) {
					e.printStackTrace();
					//예외 발생 했는지 출력 
				}
				System.out.println(aFile.length()+" Byte");
				try {
					in.close();
				} catch(IOException e){
					e.printStackTrace();
				}
				break;
			}
			
			else {
				System.out.println("파일이 없습니다. 다시 입력하세요");
			}
			
			
		}//while

	}// main()
}

// C:\Java\aaa.txt
//읽을 파일: c:\aaa.txt
//파일이 없습니다. 다시 입력하세요.
// -------읽은 내용 출력
// 총 xxx bytes