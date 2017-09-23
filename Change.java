// Q.設定一個array,並且讓裡面的值互換,互換完成列印出
package Practie;

public class Change {
	public void getSwap(int[] move) {

		int temp;

		for (int i = 0; i < move.length / 2; i++) {
			temp = move[i];
			move[i] = move[move.length - (i + 1)];
			move[move.length - (i + 1)] = temp;
		}
		for (int i = 0; i < move.length; i++) {
			System.out.println(move[i]);
		}

	}

	public static void main(String[] args) {
		new Change().getSwap(new int[] { 2, 4, 6, 8 });
	}
}
