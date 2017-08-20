// Q.鍵盤輸入兩個值, 並使用String 轉換為 int,第一個變數累加第二個變數數字次 then printout
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test2_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num1 = Integer.parseInt(str);
		BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
		str = cr.readLine();
		int num2 = Integer.parseInt(str);
		int value = 0;
		for (int i = 0; i < num2; i++) {
			value = value + num1;
		}
		System.out.println(value);
	}
}
