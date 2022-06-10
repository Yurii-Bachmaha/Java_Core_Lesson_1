package lviv;

public class Application {

	public static void main(String[] args) {

		char a = 0;
		byte b = 1;
		short c = 2;
		int d = 3;
		long e = 4;
		float f = 5.5F;
		double g = 6.6;
		boolean h = true;

		System.out.println("Char = " + Character.MAX_VALUE);
		System.out.println("Char = " + Character.MIN_VALUE);
		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Int = " + Integer.MAX_VALUE);
		System.out.println("Int = " + Integer.MIN_VALUE);
		System.out.println("Long = " + Long.MAX_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Boolean = " + Boolean.TRUE);
		System.out.println("Boolean = " + Boolean.FALSE);

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int max = array[0];
		int min = array[0];

		for (int x = 0; x < array.length; x++) {
			if (array[x] > max)
				max = array[x];
			if (array[x] < min)
				min = array[x];
		}
		System.out.println();
		System.out.println("Min value - " + min);
		System.out.println("Max value - " + max);

	}

}