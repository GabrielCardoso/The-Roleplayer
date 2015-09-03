package theroleplayer.secondaryattributes;

public class ManaPoints extends Vitals {
	private int currentVal;
	private int maxVal;
	
	//-------------- METHODS --------------//
	public void takeDamage(int x) {
		if(x>this.currentVal) {
			System.out.println("You don't have enough MP.");
		}
		else {
			this.currentVal -= x;
			System.out.println("You lost " + x + " mana.");
		}
	}
	
	public void takeHeal(int x) {
		if(this.currentVal >= this.maxVal) {
			System.out.println("Can't restore above your maximum MP.");
		}
		
		else {
			if(x + this.currentVal >= this.maxVal) {
				this.currentVal = this.maxVal;
				System.out.println("You are at full MP.");
			}
			else {
				this.currentVal += x;
				System.out.println("Received " + x + " MP from a regen source.");
			}
		}
	}
	//-------------- SETTERS --------------//
	
	//-------------- GETTERS --------------//

}
