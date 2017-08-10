import java.io.*;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int strenth = Integer.parseInt(str1);
		int width = Integer.parseInt(str2);
		int face = 0;
		face = strenth * width;

		System.out.println(face);

		String a1 = "1";
		String b1 = "2";
		int a = 0;
		int b = 0;
		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		System.out.println(a + " " + b);
		 int temp = a;
		    a = b;
		    b = temp;
		System.out.println(a + " " + b);
	}
}