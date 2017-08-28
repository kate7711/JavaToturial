//Q. 宣告兩個不同長度的String array(a,b), 再宣告一個 c arrey, 讓  c=a+b....並printout結果

class JJ {

	String[] a = { "a", "a1", "a2" };
	String[] b = { "b", "b1", "b2", "b3" };

	void setChange() {
		// 決定array C 的長度(取 array A,B的最大值)
		String[] c = new String[Math.max(this.a.length, this.b.length)];
		for (int i = 0; i < this.a.length; i++) {
			c[i] = this.a[i];
		}
		for (int i = 0; i <this.b.length; i++) {
			c[i] = c[i] + this.b[i];
		}
		// for each, 宣告String ahh( c裡的東西都叫做 ahh, c[0]=ahh, c[1]=ahh...) 
		for (String ahh : c){
		System.out.println(ahh);
		}
	}

}

public class Test8 {
	public static void main(String[] args) {
		JJ JJ1 = new JJ();
		JJ1.setChange();

	}
}
