package theroleplayer.system;
import theroleplayer.classes.*;

public class Player {
	
	public Player(String classe, int level) {
		switch(classe) {
			case "acolyte":
			case "Acolyte":
				this.classe = new Acolyte();
				break;
				
			case "archer":
			case "Archer":
				this.classe = new Archer();
				break;
				
			case "burglar":
			case "Burglar":
				this.classe = new Burglar();
				break;
				
			case "mage":
			case "Mage":
				this.classe = new Mage();
				break;
				
			case "paladin":
			case "Paladin":
				this.classe = new Paladin();
				break;
				
			case "warrior":
			case "Warrior":
				this.classe = new Warrior();
				break;
				
			default:
				System.out.println("Insert a valid class");
		}
		
		this.level = level;
	}
	
	public static final double EXPTOLEVEL_FACTOR = 1.2;
	
	private String name;
	private int exp;
	private double expToLevel = this.level*100.0;
	private int level;
	private Classe classe;
	
	//-------------- METHODS --------------//
	public void gainExp(int x) {
		this.exp += x;
		if(this.exp >= expToLevel) {
			this.level++;
			this.exp = 0;
			this.expToLevel = Math.pow(this.level*100.0, EXPTOLEVEL_FACTOR);
			this.levelAttributes();
		}
	}
	
	private void levelAttributes() {
		//updating attributes after leveling
	}
	
	//-------------- SETTERS --------------//
	public void setName(String x) {
		if(x.length() >= 3 && x.length() <= 10 && x !="")
			this.name = x;
		else
			System.out.println("Insert a name between 3 and 10 letters.");
	}
	
	public void setExp(int x) {
		if(x < 0)
			System.out.println("Only positive numbers are valid.");
		else
			this.exp = x;
	}
	
	public void setLevel(int x) {
		if(x < 0)
			System.out.println("Only positive numbers are valid.");
		else
			this.level = x;
	}
	
	//-------------- GETTERS --------------//
	public String getName() {
		return this.name;
	}
	
	public int getExp() {
		return this.exp;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public double getExpToLevel() {
		return this.expToLevel;
	}
}
