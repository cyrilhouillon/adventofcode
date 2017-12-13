package day13;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirewallBuilderTest {

	private FirewallBuilder builder = new FirewallBuilder();
	
	@Test
	public void test() {
		String input = "0: 3\n" + 
				"1: 2\n" + 
				"4: 4\n" + 
				"6: 4";
		
		Firewall firewall = builder.parse(input);
		
		assertEquals(3, firewall.get(0).getSize());
		assertEquals(2, firewall.get(1).getSize());
		assertEquals(0, firewall.get(2).getSize());
		assertEquals(0, firewall.get(3).getSize());
		assertEquals(4, firewall.get(4).getSize());
		assertEquals(0, firewall.get(5).getSize());
		assertEquals(4, firewall.get(6).getSize());
	}

}
