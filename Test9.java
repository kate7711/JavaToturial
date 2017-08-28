import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Meaning {
	String a = "Dirty";
	String b = "dust";

	// 由於要回傳 T/F,所以要把void改成 boolean
	boolean setInclude() {
		// 如果字串a包含字串b
		if (this.a.contains(this.b)) {
			return true;
		} else {
			return false;

		}

	}
}

public class Test9 {
	private static PrintWriter out;

	public static void main(String[] args) throws FileNotFoundException {
		String a = "Allen";
		String b = "piggy";

		// 設定所有的字串為小寫
		b = b.toLowerCase();
		System.out.println("Hello " + a + " " + b);
		// 自動存檔在電腦裡,路徑要自己打
		out = new PrintWriter("C:\\Users\\Alma\\Desktop\\emp\\b.txt");
		out.println(b);
		// 要記得最後要關起來要打一行close
		out.close();

		Meaning Meaning1 = new Meaning();
		//因為要印 method 裡的結果,所以要把整串帶入println裡面
		System.out.println(Meaning1.setInclude());
	}

}
