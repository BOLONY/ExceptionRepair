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
		
		//FileOutputStream 객체를 생성하면 파일이 하나 생성됨
		ObjectOutputStream out = null;
		
		out = new ObjectOutputStream(new FileOutputStream("ob.data"));
		out.writeObject(list);
		out.close();
		
	}//main
}
