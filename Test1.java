
public class Test1 {
	public static void main(String[] args) {

		String firstname = "Chia-wen";
		String surname = "Alma";

		System.out.println(
				"Hello" + " " + firstname + " " + " " + surname + " " + "Goodbye" + " " + surname + "+" + firstname);

		String height = "1.62";
		String weight = "47";
		double h1 = 0;
		int w1 = 0;
		h1 = Double.parseDouble(height);
		w1 = Integer.parseInt(weight);
		double BMI = 0;
		BMI = (w1 / (h1 * h1));
		System.out.println(BMI);

	}
}
