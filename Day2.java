
public class Day2 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 6;
		System.out.println("5 add 6 equal" + (num1 + num2));
		num1 -= num2;
		System.out.println(num1);

		num1 = 5;
		num2 = 6;
		num1 += num2;
		System.out.println(num1);

		String height = "162";
		int sum = 0;
		sum = Integer.parseInt(height);
		sum = sum + 5;
		System.out.println(sum);

	}
}
