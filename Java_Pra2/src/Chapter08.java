
public class Chapter08 {
	public static void main(String[] args) {
		int count = 1;
		int c;
		while (count < 5) {
			c = count * count;
			System.out.println(c);
			count++;
		}
		int array[] = { 1, 2, 3, 4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int number : array) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}
}
