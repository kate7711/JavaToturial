// Q. 九九乘法表
// Q. 宣告3個變數 4,2,1 分別做3個 for迴圈,變數 4 加 三次 1,變數2 加三次2,變數1 加三次3, 
//    將所得數值比較,printout Max
public class Day4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.println("i=" + i + " " + "j=" + j + " " + " " + "i*j=" + i * j);
				j++;
			}

		}

		int a = 4;
		int b = 2;
		int c = 1;
		int i = 1;
		int max = 0;
		do {
			a = a + i;
			i++;
		} while (i <= 3);
		i = 1;
		do {
			b = b + 2;
			i++;
		} while (i <= 3);
		i = 1;
		do {
			c = c +  3;
			i++;
		} while (i <= 3);
		if (a > max) {
			max = a;
		}
		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}
		System.out.println(max);
	}
}
