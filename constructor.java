//Q.取一個名叫Caculator的class, 給兩個變數a,b,constrotor the methods 並印出加減乘除後的結果
class Caculator {
	private int num1;
	private int num2;

	public Caculator(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public Caculator() {
		num1 = 0;
		num2 = 0;

	}

	public void showAdd() {
		System.out.println(this.num1 + this.num2);

	}

	public void showSub() {
		System.out.println(this.num1 - this.num2);

	}

	public void showTime() {
		System.out.println(this.num1 * this.num2);

	}

	public void showDiv() {
		if (this.num2 != 0) {
			System.out.println(this.num1 / this.num2);
		} else {
			System.out.println("GG");
		}
	}
}

public class constructor {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;

		Caculator caculator1 = new Caculator(a, b);
		caculator1.showAdd();
		caculator1.showSub();
		caculator1.showTime();
		caculator1.showDiv();

	}

}
