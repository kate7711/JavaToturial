class Player {
	int HP;
	String Name;

	void showPlayer() {
		System.out.println("My name is" + " " + Name + " " + "HP is" + " " + HP);
	}
}

public class Day6 {
	public static void main(String[] args) {
		Player player1;
		player1 = new Player();

		player1.HP = 1;
		player1.Name = "Alma";

		player1.showPlayer();
		
		Player player2 = new Player();
		player2.HP = 0;
		player2.Name = "Allen";
		player2.showPlayer();
	}

}
