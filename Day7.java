//Q.取一個名叫AlmaMath的class, 練習如何存取,以及如何叫值,printout 數字10的所有因數
class AlmaMath {
	int num;
	int getNum() {
		return num;
	}
	void setNum(int n) {
		num = n;
	}
	void showAlmaMath() {

		for (int i = 1; i <= this.getNum(); i++) {
			if (this.getNum() % i == 0) {
				System.out.format(" %d  ", i);
			}
		}

	}

}

public class Day7 {
	public static void main(String[] args) {
		AlmaMath math1 = new AlmaMath();

		int num = 10;
		math1.setNum(num);
		math1.showAlmaMath();
     
	}
}
