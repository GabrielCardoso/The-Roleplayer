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
	
	//-------------- GETTERS --------------//
	public int getMaxVal() {
		return this.maxVal;
	}
	
	public int getCurrentVal() {
		return this.currentVal;
	}
}
