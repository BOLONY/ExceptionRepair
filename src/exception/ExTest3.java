package exception;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExTest3 {
	public static void main(String[] args) {
		int num[] = new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("hi");
		//Ű����� ���� 5���� �Է¹޾� �迭 num�� ����
		for(int i = 0 ; i<num.length; ) {
			try {
				num[i] = input.nextInt();
			}
			catch (InputMismatchException e) {
				input.nextLine();
//				i--;
				// �Ķ���� ����
				//���� ���� i������ �ٽ�
			}//catch
			i++;
		}//for
		//�迭�� ����� �� 5���� ���
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}

