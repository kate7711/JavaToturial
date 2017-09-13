// Q. 建立一個boolean method,並宣告兩個String 變數, 使用Array 比較String內的字元是否
//    相同,如果相同則回覆true;不同則回覆false

//下面這行是寫array排序時會自動出現的語法
import java.util.Arrays;

//宣告類別,名稱為RR
class RR {

	// 寫一個method,有寫入「(String a, String b)」這個兩個引數表示這是有參數的method
	// a,b是用來接受值的參數
	// 語法:傳回值的資料型態 方法名稱(參數列表)
	public boolean setJudge(String a, String b) {
		// 先使用if來判斷兩個String的長度,如果不同,則回覆false
		if (a.length() != b.length()) {
			return false;
		}
		// 宣告Array,名稱為temp,temp1,值為分開字元的a,分開字元的b
		String[] temp = a.split("");
		String[] temp1 = b.split("");
		// 在比較前先把字串排序
		Arrays.sort(temp);
		Arrays.sort(temp1);
		// 使用for迴圈來寫比較的範圍,宣告一個變數i=0,如果i大於temp.length,則跳離迴圈
		for (int i = 0; i < temp.length; i++) {
			// 使用if敘述句來比較array內的字元
			// 為避免一比較到相同就結束迴圈的bug,所以將程式反過來寫→ if 兩個字串不相等,
			// 則回覆false,
			if (!temp[i].equals(temp1[i])) {
				return false;
			}
		}
		//表示迴圈的東西做完了,就回傳true
		return true;
	}

}
//建立RR此類別的新物件(Object)
public class REVIEWALL_2 {
	public static void main(String[] args) {
		//宣告RR型態的變數,名稱為RR1
		RR RR1 = new RR();
		// RR1.setJudge("koko", "ooko");
		//列印出結果,須將呼叫方法整串放入括號內
		System.out.print(RR1.setJudge("koko", "ooko"));

	}
}
