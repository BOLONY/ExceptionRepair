package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		
		
		while (true) {
			System.out.println("�������� �Է�: ");
			try {
				score = input.nextInt();
				if (score < 0 || score > 100) {
					throw new ScoreException();
				}
			}
			catch(InputMismatchException e) {
				System.out.println("���ڷ� �Է��ϼ���.");
				input.nextLine();
				continue; //�ݺ��� ��� ����.
			}
			catch(ScoreException e) {
				e.printStackTrace();
				//� �������� ���
				continue;
			}
			break;
		}//while
		System.out.println(score);
	}

}
