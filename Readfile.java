// Q. 從檔案A1.txt & B1.txt讀取資料,一次讀取一行,讀完後合併成一個新檔案,輸出至新檔案,檔名C1
package Practie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Readfile {
	// 下面一行為將資料輸出至txt檔的語法,宣告PrintEriter out
	private static PrintWriter out;

	public static void main(String[] args) {
		// 使用try來寫讀取檔案的語法
		try {
			// 讀取檔案,記得給完整路徑
			BufferedReader ar = new BufferedReader(new FileReader("C:\\Users\\Alma\\Desktop\\emp\\A1.txt"));
			String str1 = "";
			// 另外宣告一個變數,讓你可以去做一些你要的東西
			String file1 = "";
			// 使用while,括號內的意思是當「str1 = ar.readLine()) != null」非空值
			// 就繼續反覆執行
			// ps.readLine如果寫兩次,僅會讀取到第二行,因為會把第一行的值覆蓋掉
			while ((str1 = ar.readLine()) != null) {
				// 下面一行做的是希望可以讀取到每一行的值「"\r\n"」是換行的意思
				file1 += str1 + "\r\n";
			}

			// 讀取檔案,記得給完整路徑
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alma\\Desktop\\emp\\B1.txt"));
			String str2 = "";
			// 另外宣告一個變數,讓你可以去做一些你要的東西
			String file2 = "";
			while ((str2 = br.readLine()) != null) {
				file2 += str2 + "\r\n";

			}
			// 把String file1裡的值拆開, 並且重新宣告一個array,名稱str11
			// 把String file2裡的值拆開, 並且重新宣告一個array,名稱str22
			String[] str11 = file1.split("\r\n");
			String[] str22 = file2.split("\r\n");
			// 輸出至檔案,記得給完整路徑
			out = new PrintWriter("C:\\Users\\Alma\\Desktop\\emp\\C1.txt");

			// 使用for迴圈,將所讀取的資料列印出,i的範圍需取兩個String的最小值
			for (int i = 0; i < Math.min(str11.length, str22.length); i++) {
				// 將資料列印出在下方的結果裡
				System.out.println(str11[i]);
				System.out.println(str22[i]);

				// 將資料印出在所輸出的檔案裡
				out.println(str11[i]);
				out.println(str22[i]);
			}
			// 要記得最後要關起來要打一行close
			// 寫在for迴圈外面,因為不讓它一直重複關閉又開啟
			out.close();
			// 讀取完檔案記得要關起來,打一行close，需打在try裡面
			ar.close();
			br.close();

		}
		// catch跟try是一個組合,記得寫
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
