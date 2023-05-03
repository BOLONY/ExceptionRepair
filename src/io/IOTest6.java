package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class IOTest6 {
//main���� Exception �ϸ� �ƿ� Exceptio ó�� ���ϰڴٴ� �ǹ�
	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
		FileOutputStream out = null;
		int i;
		String inFilename, outFilename;
		File inFile, outFile;
		Scanner sc = new Scanner(System.in);
		
		//���� ����
		//1 ����Ʈ�� �б�
		System.out.println("���� ���ϸ�: ");
		inFilename = sc.nextLine();
		inFile = new File(inFilename);
		if(!inFile.isFile()) {
			System.out.println(inFilename + "������ �����ϴ�.");
			return;
		}
		in = new FileInputStream(inFilename);
		
		//��� ����
		System.out.println("�纻 ���ϸ�:");
		outFilename = sc.nextLine();
		outFile = new File(inFilename);
		if(outFile.isFile()) {
			System.out.println("�̹� �����ϴ� ���ϸ��Դϴ�. ����� (y/n)");
			if(sc.nextLine().equalsIgnoreCase("n"))
				return;
		}
		out = new FileOutputStream(outFilename);
		
		/*i = in.read(); //1����Ʈ �о����
		out.write(i); //�������κ��� 1����Ʈ �޾Ƽ� ����*/
		while ((i= in.read()) != -1) {
			out.write(i);
		}
		
		in.close();
		out.close();
	}

}
