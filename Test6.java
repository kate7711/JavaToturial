class Homework {
	int i = 1;
	int res = 0;

	public void tennum(int i) {
		for (int i1 = 1; i1 <= 10; i1++) {
			System.out.print(i1 + " ");
		}
	}

	public void crossTwo(int j) {
		int j1 = 1;
		while (j1 <= 11) {
			System.out.print(j1 + " ");
			j1 = j1 + 2;
		}
	}

	int getRes() {
		return res;
	}

	public void setRang(int res) {
		if (res <= 5) {
			System.out.print("<5");
		} else if (6 <= res || res >= 10) {
			System.out.print("6~10");
		} else {
			System.out.print(">10");
		}
	}

	public void arrey(int k) {
		int[] num;
		num = new int[3];
		num[0] = 20;
		num[1] = 87;
		num[2] = 18;
		int min = Integer.MAX_VALUE;
		for (int k2 = 0; k2 < 3; k2++) {
			if (num[k2] < min) {
				min = num[k2];
			}
		}
		System.out.println("min =" + min);
	}

}

public class Test6 {
	public static void main(String[] args) {
		Homework homework1 = new Homework();
		homework1.tennum(10);
		System.out.println();
		homework1.crossTwo(11);
		System.out.println();
		homework1.setRang(7);
		System.out.println();
		homework1.arrey(3);

	}

}
