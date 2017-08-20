// Q.使用String 轉換成int,計算 BMI; 用if分類(BMI>25 且 age>50 printout GG, 
//   18<BMI<25 且 20<age<50 printout ok,BMI<18 且 age<20 printout skeiton)
// Q.宣告 三個變數, printout Max
public class Day3 {
	public static void main(String[] args) {
		String height = "1.62";
		String weight = "90";
		double h1 = 0;
		int w1 = 0;
		h1 = Double.parseDouble(height);
		w1 = Integer.parseInt(weight);
		double BMI = 0;
		BMI = (w1 / (h1 * h1));
		int age = 0;
		age = 20;
		System.out.println(BMI);
		if (BMI > 25 && age > 50) {
			System.out.println("GG");
		} else if ((BMI >= 18 && BMI <= 25) && (age >= 20 && age <= 50)) {
			System.out.println("ok");
		} else {
			System.out.println("skelton");
		}

		int a = 0;
		int b = 0;
		int c = 0;
		a = 6;
		b = 5;
		c = 4;
		int max = 0;
		if (a > max) {
			max = a;
		}
		if (b>max){
			max = b;
		}
			
		if (c>max){
			max=c;
		}
		 System.out.println(max);		
	}
}
