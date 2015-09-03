package theroleplayer.system;

import theroleplayer.classes.*;
import theroleplayer.primaryattributes.*;
import theroleplayer.secondaryattributes.*;

public class Player {
	
	public static final double EXPTOLEVEL_FACTOR = 1.05;
	public static final int LEVELCAP = 60;
	
	public Player(String name, String classe, int level) {
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
				
			case "gamemaster":
			case "gameMaster":
			case "Gamemaster":
			case "GameMaster":
				this.classe = new GameMaster();
				break;
				
			default:
				System.out.println("Insert a valid class.");
				break;
		}
		
		this.setName(name);
		this.setLevel(level);
		this.setExpToLevel();
		System.out.println("Player created.");
	}
	
	private String name;
	private int exp;
	private double expToLevel;
	private int level;
	private Classe classe;
	
	private Strength str = new Strength();
	private Constitution con = new Constitution();
	private Dexterity dex = new Dexterity();
	private Intelligence intel = new Intelligence();
	private Wisdom wis = new Wisdom();
	
	private HealthPoints hp = new HealthPoints();
	private ManaPoints mp = new ManaPoints();
	
	//-------------- METHODS --------------//
	public void gainExp(int x) {
		if(this.level == LEVELCAP) {
			System.out.println("Level cap reached.");
		}
			
		else {
			this.exp += x;
			if(this.exp >= expToLevel) {
				this.setLevel(this.level+1);
				this.setExp(0);
				this.setExpToLevel();
				this.levelAttributes();
			}
		}
	}
	
	private void levelAttributes() {
		//updating attributes after leveling
		System.out.println("You leveled up!");
	}
	
	//-------------- SETTERS --------------//
	public void setName(String x) {
		if(x.length() >= 3 && x.length() <= 10 && x !="")
			this.name = x;
		else
			System.out.println("Insert a name between 3 and 10 letters.");
	}
	
	
	public void setLevel(int x) {
		if(x <= 0 || x > LEVELCAP)
			System.out.println("Insert a number between 1 and the level cap.");
		else {
			this.level = x;
			this.setExpToLevel();
		}
	}

	private void setExp(int x) {
		if(x < 0)
			System.out.println("Only positive numbers are valid.");
		else
			this.exp = x;
	}
	
	private void setExpToLevel() {
		if(this.level == 1) 
			this.expToLevel = 100.0;
		else 
			this.expToLevel = Math.pow(this.level*100.0, EXPTOLEVEL_FACTOR);
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
