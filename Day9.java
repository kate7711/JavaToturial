class DD {

	String[] name = { "Alma", "is", "Snorlax" };

	void showDD() {
		String str = "";//>也可不寫
		int max = 0;
		int min = Integer.MAX_VALUE;
		int indexmax = 0;
		int indexmin = 0;
		float average = 0;

		for (int i = 0; i <= 2; i++) {
			str = name[i];         //
			int len = str.length();// int len=name[i].length();
			if (len > max) {
				max = len;
				indexmax = i;
			}
			if (len < min) {
				min = len;
				indexmin = i;
			}
			average += len;

		}
	
		System.out.println(name[indexmax]);
		System.out.println(name[indexmin]);
		System.out.println(average/name.length);
	}
}

public class Day9 {
	public static void main(String[] args) {
		DD DD1 = new DD();

		DD1.showDD();

	}
}
