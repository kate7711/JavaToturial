class Car {
	String color;
	int speed;
	int gas;

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}

	int getGas() {
		return gas;
	}

	public Car() {
		color = "white";
		speed = 0;
		gas = 0;
		System.out.println(color);
	}

	public void setCar(String c, int s, int g) {
		color = c;
		speed = s;
		gas = g;
	}

	public void addSpeed(int s) {
		if (s < 0) {
			System.out.println("Error");
		} else {
			this.speed = s + this.speed;
		}
	}

	public void addGas(int g) {
		if (g < 0) {
			System.out.println("Error");
		} else {
			this.gas = g + this.gas;
		}
	}

	public void show() {
		System.out.println("My car is " + this.color + " the speed is " + this.speed + "and the gas is" + this.gas);
	}

}

public class constructor2 {
	public static void main(String[] args) {
		String c = "";
		int s = 0;
		int g = 0;

		Car car1 = new Car();
		car1.show();
		car1.setCar("red", 3, 2);
		car1.addSpeed(20);
		car1.show();
		car1.addGas(-5);
		car1.addSpeed(-30);
		car1.show();
	}
}
