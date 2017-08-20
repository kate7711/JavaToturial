// Q.假設樂透抽六個號碼,隨機抽取並排序，printout
import java.util.*;

class Test5 {
	public static void main(String[] args) {
		int c;
		Random t = new Random();
		Integer[] lottery = new Integer[6];
		for (c = 0; c < lottery.length;) {
			Integer temp = t.nextInt(10);
			if (!Arrays.asList(lottery).contains(temp)) {
				lottery[c] = temp;
				c++;
			}
		}
		for (int i = 0; i < lottery.length - 1; i++) {
			for (int j = i + 1; j < lottery.length; j++) {
				if (lottery[j] > lottery[i]) {
					int tmp = lottery[j];
					lottery[j] = lottery[i];
					lottery[i] = tmp;

				}
			}
		}
		for (int i = 0; i < lottery.length - 1; i++) {
			System.out.println(lottery[i]);
		}
	}

}
