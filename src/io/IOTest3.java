package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//텍스트 파일 읽기
public class IOTest3 {

	public static void main(String[] args) {
		FileReader in  = null;
		int ch;
		
		try {
			in = new FileReader("C:\\Users\\user\\git\\JAVA_SCIT\\KM_44\\src\\School\\Student.java");
		}catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			return;
		}
		//read 메서드가 리턴 타입이 int
		try {
			while((ch = in.read()) != -1) { //파일에서 1문자 읽기
				//읽을 문자가 없으면 -1 반환 키워드
				System.out.print((char)ch); //읽은 문자 출력
			}
		}catch(IOException e) {
			e.printStackTrace();
			//예외 발생 했는지 출력 
		}
		
		/*try {
			ch = (char) in.read();
			System.out.println((char)ch);
		} catch(IOException e){
			e.printStackTrace();
		}*/
		
		try {
			in.close();
		} 
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
