package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//�ؽ�Ʈ ���� �б�
public class IOTest3 {

	public static void main(String[] args) {
		FileReader in  = null;
		int ch;
		
		try {
			in = new FileReader("C:\\Users\\user\\git\\JAVA_SCIT\\KM_44\\src\\School\\Student.java");
		}catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		//read �޼��尡 ���� Ÿ���� int
		try {
			while((ch = in.read()) != -1) { //���Ͽ��� 1���� �б�
				//���� ���ڰ� ������ -1 ��ȯ Ű����
				System.out.print((char)ch); //���� ���� ���
			}
		}catch(IOException e) {
			e.printStackTrace();
			//���� �߻� �ߴ��� ��� 
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
