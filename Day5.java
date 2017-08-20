// Q. 僅宣告一個變數，創造三個一數的迴圈 printout(ex.a,a+3,a+6) ps.使用 while & for 各做一次
// Q. do 兩個陣列關於學生成績，tes1=50,70,90,tast2 將第三個成績改為55, 並分別printout
public class Day5 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 7) {
			System.out.println(i);
			i = i + 3;
		}

		for (int i1 = 1; i1 <= 7; i1 += 2) {
			System.out.println(i1);
			i1 = i1 + 1;
		}
		int[] test1 = new int[3];
		test1[0] = 50;
		test1[1] = 70;
		test1[2] = 90;
		int[] test2;
		test2 = test1;
		for (int j = 0; j < 3; j++) {
			System.out.println(test1[j]);
		}
		for (int j = 0; j < 3; j++) {
			System.out.println(test2[j]);
		}
		test2[2] = 55;
		for (int j = 0; j < 3; j++) {
			System.out.println(test1[j]);
		}
		for (int j = 0; j < 3; j++) {
			System.out.println(test2[j]);
		}
	}
}
