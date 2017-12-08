package daytwo;

public class Division {
	
	private int dividende;
	private int divisor;

	public Division(int dividende, int divisor) {
		this.dividende = dividende;
		this.divisor = divisor;
	}

	public boolean isEvenlyDivisible() {
		return dividende % divisor == 0;
	}
	
	public int result() {
		return dividende / divisor;
	}
}
