package code14_11;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;

		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		h1.money = 300;
		System.out.println(h2.money);
	}

}
