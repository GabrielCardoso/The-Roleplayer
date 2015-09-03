package theroleplayer.secondaryattributes;

public class HealthPoints extends Vitals {
	private int currentVal;
	private int maxVal;
	
	//-------------- METHODS --------------//
	public void takeDamage(int x) {
		if(x>this.currentVal) {
			System.out.println("You are dead.");
		}
		else {
			this.currentVal -= x;
			System.out.println("You took " + x + " damage.");
		}
	}
	
	public void takeHeal(int x) {
		if(this.currentVal >= this.maxVal) {
			System.out.println("Can't heal above your maximum HP.");
		}
		
		else {
			if(x + this.currentVal >= this.maxVal) {
				this.currentVal = this.maxVal;
				System.out.println("You are at full HP.");
			}
			else {
				this.currentVal += x;
				System.out.println("Received " + x + " HP from healing.");
			}
		}
	}
	//-------------- SETTERS --------------//
	
	//-------------- GETTERS --------------//

}
