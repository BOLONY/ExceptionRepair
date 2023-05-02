package exception;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExTest3 {
	public static void main(String[] args) {
		int num[] = new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("hi");
		//키보드로 정수 5개를 입력받아 배열 num에 저장
		for(int i = 0 ; i<num.length; ) {
			try {
				num[i] = input.nextInt();
			}
			catch (InputMismatchException e) {
				input.nextLine();
//				i--;
				// 파라미터 변수
				//버퍼 비우고 i번쨰를 다시
			}//catch
			i++;
		}//for
		//배열에 저장된 값 5개를 출력
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}

