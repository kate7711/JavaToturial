/**
  problem description:
  Say you have an array for which the ith element is the price of a given stock on day i.
  If you were only permitted to complete at most one transaction 
  (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
  Example 1:
  Input: [7, 1, 5, 3, 6, 4]
  Output: 5
  
  max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
  Example 2:
  Input: [7, 6, 4, 3, 1]
  Output: 0
  
  In this case, no transaction is done, i.e. max profit = 0.
*/
package Practie;

public class Profit {
	public int getEarn(int[] revenue) {
		int max = 0;
		//用for迴圈來設定i的範圍
		for (int i = 0; i < revenue.length; i++) {
			//再用一個for迴圈來設定j的範圍
			for (int j = i + 1; j < revenue.length; j++) {
				//if條件式來找出所要的值
				if (max < (revenue[j] - revenue[i])) {
					max = (revenue[j] - revenue[i]);
				}
			}

		}
		//記得回傳max
		return max;
	}

	public static void main(String[] args) {
		//使用者可以自行輸入變數個數,即變數的值
		System.out.println(new Profit().getEarn(new int[] { 2, 4, 8 }));
	}
}
