package exception;

public class extest1 {
	public static void main(String[] args) {
		String ar[] = {"10", "0"};
		int a, b, c, d;
		//하위 클래스를 상위클래스 보다 위에 써줘야 한다.
		try { //예외가 발생할 수 있는 코드
			a = Integer.parseInt(ar[0]); //int 바꾸기
			b = Integer.parseInt(ar[1]);
			c = a + b;
			d = a / b;
			System.out.println(c);
			System.out.println(d);
		}
		catch (NumberFormatException abc) {
			System.out.println("숫자가 아님");
			return;
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 index가 범위를 넘어감");
		}
		finally { //예외처리 마지막
			// 파일 입출력시 반드시 close 메서드를 써야 되는데
			System.out.println("마지막에 무조건");
		}
		System.out.println("프로그램의 끝");
	}
}
