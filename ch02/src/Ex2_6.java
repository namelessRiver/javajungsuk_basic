import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� �ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);  // �Է� ���� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� : " + input);
		System.out.printf("num = %d %n", num);
	}

}
