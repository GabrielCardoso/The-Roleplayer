package theroleplayer.secondaryattributes;

public abstract class Vitals {
	private int maxVal;
	private int currentVal;
	
	//-------------- METHODS --------------//
	public abstract void takeDamage(int x);
	public abstract void takeHeal(int x);
	
	//-------------- SETTERS --------------//
	public void setMaxVal(int x) {
		if(x<=0)
			System.out.println("Insert a positive number different than 0.");
		else {
			this.maxVal = x;
			this.currentVal = this.maxVal;	
		}
	}
	
	public void setCurrentVal(int x) {
		if(x<0 || x>this.maxVal)
			System.out.println("Insert a positive number between 0 and " + this.getMaxVal() + ".");
		else {
			this.currentVal = x;	
		}
	}
	
	//-------------- GETTERS --------------//
	public int getMaxVal() {
		return this.maxVal;
	}
	
	public int getCurrentVal() {
		return this.currentVal;
	}
}
