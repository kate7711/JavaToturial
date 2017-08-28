// Q.宣告一個 static 的字串"Alma",在另宣告一個字串"Allen",比較兩個字串,若一樣則印出good;若不一樣
//   則印出bad
// Q.寫一個method,比較鍵盤輸入的字串與字串"Alma"是否一樣,若一樣印出"ALMA",若不一樣則印出"allen is
//   piggy"
// O.寫一個for迴圈,將Alma列印十次出來
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day8 {

	public static String name1 = "Alma";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name2 = "Allen";
		if (name1.equals(name2)) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
		String str = br.readLine();
		if (name1.equals(str)) {
			System.out.println(str.toUpperCase());
		} else {
			System.out.println("allen is piggy");
		}
		String Name = "";
		for (int i = 1; i <= 9; i++) {
			Name = name1 + Name;
		}
		System.out.println(Name);
	}
}
