package io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class IOTest1 {

	public static void main(String[] args) {
		File a = new File("a.txt");
		File b = new File("sub");		
		
		System.out.println(a.exists()); //�����ϴ��� ����Ų��.
		System.out.println(a.isFile()); //���Ϸ� �����ϴ���
		System.out.println(a.isDirectory()); // ���丮�� �����ϸ� true
		
		
		try {
			a.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		b.mkdir();
		
		System.out.println(a.exists()); //�����ϴ��� ����Ų��.
		System.out.println(a.isFile()); //���Ϸ� �����ϴ���
		System.out.println(a.isDirectory()); // 
		
		System.out.println();
		File c = new File("C:\\Users\\user\\git\\JAVA_SCIT\\KM_44\\src\\School\\Student.java");
		System.out.println(c.isFile());//���丮�� ������ �ƴѰ�
		System.out.println(c.getName());
		System.out.println(c.getParent());
		System.out.println(c.length()); //������ �뷮, ũ�� 4096byte
		// \������ �ٷ� �ڿ��ִ°� ��� Ư���������� �ȴ�.
		
		// \\���
		System.out.println();
		File d = new File("C:\\Users\\user\\git\\JAVA_SCIT\\KM_44\\src\\School");
		String filenames[] = d.list();// ������ ����� ���ϸ�
		
		for (String name : filenames) {
			System.out.println(name);
		}
		System.out.println();
		
		File files[] = d.listFiles();
		
		System.out.println(d.list());
		// ���� ��ġ �˾Ƴ���
		File e = new File(".");
		try {
			System.out.println(e.getCanonicalPath());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ���ϸ� �����ϱ�
		File f = new File("a2.txt");
		a.renameTo(f); //f�� ����Ű�� ��ü�� ����
		// ���� �����ϱ�
		a.delete();
	
		
	}

}
