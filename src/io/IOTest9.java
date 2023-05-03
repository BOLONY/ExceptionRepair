package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class IOTest9 {

	public static void main(String[] args) throws Exception {
		
		Data d1 = new Data(1, 2.3, "aaaaa");
		Data d2 = new Data(2, 1.11, "bbbb");
		Data d3 = new Data(3, 3.33, "cccc");
		
		
		//위 3개의 객체를 파일에 저장하기 위한 스트링 객체 생성해보기
		ObjectOutputStream out = null;
		
		out = new ObjectOutputStream(new FileOutputStream("ob2.data"));
		
		out.writeObject(d1);
		out.writeObject(d2);
		out.writeObject(d3);
		
		out.close();
	}

}
