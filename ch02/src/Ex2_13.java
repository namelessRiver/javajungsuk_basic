
public class Ex2_13 {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d \n", i, b);
		System.out.println("i=" + Integer.toBinaryString(i));
		
		i = 100;
		b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d \n", i, b);
		System.out.println("i=" + Integer.toBinaryString(i));
		
		i = 10;
		b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d \n", i, b);
		System.out.println("i=" + Integer.toBinaryString(i));
		
		i = -2;
		b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d \n", i, b);
		System.out.println("i=" + Integer.toBinaryString(i));
	}

}
