package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOTest7 {

	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaaaaaa");
		list.add("bbbb");
		list.add("cccc");
		
		//FileOutputStream ��ü�� �����ϸ� ������ �ϳ� ������
		ObjectOutputStream out = null;
		
		out = new ObjectOutputStream(new FileOutputStream("ob.data"));
		out.writeObject(list);
		out.close();
		
	}//main
}
