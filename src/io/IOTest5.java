package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest5 {

	public static void main(String[] args) {
		BufferedReader br = null;
		int ch;
		String s;
		
		try{
			br = new BufferedReader(new FileReader("C:\\Java\\asdasd.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			return;
		}
		try {
			while(true) {
				s = br.readLine();
				if(s == null) break;
				System.out.println(s);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		new BufferedReader(new InputStreamReader(System.in));

	}//main
}
