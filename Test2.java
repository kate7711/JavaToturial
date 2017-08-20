// Q. 鍵盤輸入兩個值, 並使用String 轉換為 int,printout Max
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		int max = 0;
		BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
		str = cr.readLine();
		int b = Integer.parseInt(str);

		if (a > max) {
			max = a;
		}
		if (b > max) {
			max = b;
		}
		System.out.println("max=" + max);
	}

}
