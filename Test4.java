//Q 宣告一個array[5],5個變數,printout 1.Max 2.min 3.average
public class Test4 {
	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 5;
		num[1] = 4;
		num[2] = 3;
		num[3] = 2;
		num[4] = 1;
		int max = 0;
		int min = Integer.MAX_VALUE;
		double average = 0;
		for (int i = 0; i < 5; i++) {
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
			average += num[i];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		System.out.println("average=" + average / 5);
	}
}
