package exception;

public class extest1 {
	public static void main(String[] args) {
		String ar[] = {"10", "0"};
		int a, b, c, d;
		//���� Ŭ������ ����Ŭ���� ���� ���� ����� �Ѵ�.
		try { //���ܰ� �߻��� �� �ִ� �ڵ�
			a = Integer.parseInt(ar[0]); //int �ٲٱ�
			b = Integer.parseInt(ar[1]);
			c = a + b;
			d = a / b;
			System.out.println(c);
			System.out.println(d);
		}
		catch (NumberFormatException abc) {
			System.out.println("���ڰ� �ƴ�");
			return;
		}
		catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� index�� ������ �Ѿ");
		}
		finally { //����ó�� ������
			// ���� ����½� �ݵ�� close �޼��带 ��� �Ǵµ�
			System.out.println("�������� ������");
		}
		System.out.println("���α׷��� ��");
	}
}
