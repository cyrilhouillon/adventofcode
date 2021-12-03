package day13;

public class Simulation {

	public static void main(String[] args) {
		
		int delay = 0;
		while(!canPassWaiting(delay)){
			delay++;
		}
		System.out.println(delay);
	}
	

	private static boolean canPassWaiting(int delay) {
		return simulate(delay) == 0;
	}


	private static int simulate(int delay) {
		Firewall firewall = new FirewallBuilder().parse(exampleInput);
		firewall.delay(delay);
		firewall.moveToEnd();
		return firewall.getSeverity();
	}
	
	
	private static final String exampleInput = "0: 3\n" + 
			"1: 2\n" + 
			"4: 4\n" + 
			"6: 4";

	
	private static final String puzzleInput = "0: 5\n" + 
			"1: 2\n" + 
			"2: 3\n" + 
			"4: 4\n" + 
			"6: 6\n" + 
			"8: 4\n" + 
			"10: 6\n" + 
			"12: 10\n" + 
			"14: 6\n" + 
			"16: 8\n" + 
			"18: 6\n" + 
			"20: 9\n" + 
			"22: 8\n" + 
			"24: 8\n" + 
			"26: 8\n" + 
			"28: 12\n" + 
			"30: 12\n" + 
			"32: 8\n" + 
			"34: 8\n" + 
			"36: 12\n" + 
			"38: 14\n" + 
			"40: 12\n" + 
			"42: 10\n" + 
			"44: 14\n" + 
			"46: 12\n" + 
			"48: 12\n" + 
			"50: 24\n" + 
			"52: 14\n" + 
			"54: 12\n" + 
			"56: 12\n" + 
			"58: 14\n" + 
			"60: 12\n" + 
			"62: 14\n" + 
			"64: 12\n" + 
			"66: 14\n" + 
			"68: 14\n" + 
			"72: 14\n" + 
			"74: 14\n" + 
			"80: 14\n" + 
			"82: 14\n" + 
			"86: 14\n" + 
			"90: 18\n" + 
			"92: 17";
	
}
