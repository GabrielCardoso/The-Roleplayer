package theroleplayer.system;

public class Game {
	public static void main(String[] args) {
		Player p1 = new Player("Sampa", "archer", 1);
		
		p1.hp.setMaxVal(300);
		System.out.println(p1.hp.getCurrentVal());
		p1.hp.takeDamage(100);
		
		System.out.println(p1.hp.getCurrentVal());

		p1.hp.takeDamage(100);
		p1.hp.takeDamage(100);
		System.out.println(p1.hp.getCurrentVal());

	}
}
