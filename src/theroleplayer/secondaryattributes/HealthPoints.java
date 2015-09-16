package theroleplayer.secondaryattributes;

public class HealthPoints extends Vitals {
	
	//-------------- METHODS --------------//
	public void takeDamage(int x) {
		if(x>this.getCurrentVal()) {
			System.out.println("You are dead.");
		}
		else {
			this.setCurrentVal(this.getCurrentVal() - x);
			System.out.println("You took " + x + " damage.");
			if(this.getCurrentVal() <= 0)
			{
				System.out.println("You are dead.");
			}
		}
	}
	
	public void takeHeal(int x) {
		if(this.getCurrentVal() >= this.getMaxVal()) {
			System.out.println("Can't heal above your maximum HP.");
		}
		
		else {
			if(x + this.getCurrentVal() >= this.getMaxVal()) {
				this.setCurrentVal(this.getMaxVal());
				System.out.println("You are at full HP.");
			}
			else {
				this.setCurrentVal(this.getCurrentVal() + x);
				System.out.println("Received " + x + " HP from healing.");
			}
		}
	}
	//-------------- SETTERS --------------//
	
	//-------------- GETTERS --------------//

}
