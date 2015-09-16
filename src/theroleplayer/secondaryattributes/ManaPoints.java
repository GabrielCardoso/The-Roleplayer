package theroleplayer.secondaryattributes;

public class ManaPoints extends Vitals {
//	private int currentVal;
//	private int maxVal;
	
	//-------------- METHODS --------------//
	public void takeDamage(int x) {
		if(x>this.getCurrentVal()) {
			System.out.println("You don't have enough MP.");
		}
		else {
			this.setCurrentVal(this.getCurrentVal() - x);
			System.out.println("You lost " + x + " mana.");
			if(this.getCurrentVal() <= 0)
			{
				System.out.println("You are out of mana.");
			}
		}
	}
	
	public void takeHeal(int x) {
		if(this.getCurrentVal() >= this.getMaxVal()) {
			System.out.println("Can't restore above your maximum MP.");
		}
		
		else {
			if(x + this.getCurrentVal() >= this.getMaxVal()) {
				this.setCurrentVal(this.getMaxVal());
				System.out.println("You are at full MP.");
			}
			else {
				this.setCurrentVal(this.getCurrentVal() + x);
				System.out.println("Received " + x + " MP from a regen source.");
			}
		}
	}
	//-------------- SETTERS --------------//
	
	//-------------- GETTERS --------------//

}
