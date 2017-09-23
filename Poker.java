package Practie;

import java.util.Arrays;

public class Poker {

	public boolean getCheck(int[] tigy) {
		Arrays.sort(tigy);
		// for (int i = 0; i < tigy.length - 1; i++) {
		int i = 0;
		if (tigy[i] != tigy[i + 1]) {
			if (tigy[i + 1] == tigy[i + 2]) {
				if (tigy[i + 2] == tigy[i + 3]) {
					return true;
				}
			}
		} else if (tigy[i] == tigy[i + 1]) {
			if (tigy[i + 1] == tigy[i + 2]) {
				if (tigy[i + 2] == tigy[i + 3]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new Poker().getCheck(new int[] { 7, 7, 7, 7, 1 }));
	}
}
