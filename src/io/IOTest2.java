package io;

import java.io.FileWriter;
import java.io.IOException;

//�ؽ�Ʈ ���� ���
public class IOTest2 {
	public static void main(String[] args) {
		FileWriter out = null;
		
		//��Ʈ�� ����
		try {
			out =  new FileWriter("b.txt");// ���� ����
		} catch (IOException e) {
			System.out.println("���� ���� ����");
			return;
		}
		//����� �۾�
		try {
			out.write("A");//���� �ȿ� ���� �ֱ�
			out.write("��");
			out.write("\n");
		} catch (IOException e) {
			System.out.println("���� �۾� ����");
		}
		
		//��Ʈ�� �ݱ�
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("hi");
	}
}
