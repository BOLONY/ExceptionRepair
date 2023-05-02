package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		
		
		while (true) {
			System.out.println("국어점수 입력: ");
			try {
				score = input.nextInt();
				if (score < 0 || score > 100) {
					throw new ScoreException();
				}
			}
			catch(InputMismatchException e) {
				System.out.println("숫자로 입력하세요.");
				input.nextLine();
				continue; //반복문 계속 진행.
			}
			catch(ScoreException e) {
				e.printStackTrace();
				//어떤 에러인지 출력
				continue;
			}
			break;
		}//while
		System.out.println(score);
	}

}
