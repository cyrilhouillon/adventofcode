package day13;

import static day13.Layer.emptyLayer;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FirewallTest {

	@Test
	public void testMove() {
		Firewall firewall = new Firewall(asList(
				new Layer(3),
				new Layer(2),
				emptyLayer,
				emptyLayer,
				new Layer(4),
				emptyLayer,
				new Layer(4)));
		
		firewall.move();
		firewall.move();
		firewall.move();

		assertEquals(2, firewall.get(0).getPosition());
		assertEquals(2, firewall.get(1).getPosition());
		assertEquals(0, firewall.get(2).getPosition());
		assertEquals(0, firewall.get(3).getPosition());
		assertEquals(4, firewall.get(4).getPosition());
		assertEquals(0, firewall.get(5).getPosition());
		assertEquals(4, firewall.get(6).getPosition());
	}

	@Test
	public void testSeverity() {
		Firewall firewall = new Firewall(asList(
				new Layer(3),
				new Layer(2),
				emptyLayer,
				emptyLayer,
				new Layer(4),
				emptyLayer,
				new Layer(4)));
		
		firewall.move();
		firewall.move();
		firewall.move();
		firewall.move();
		firewall.move();
		firewall.move();
		firewall.move();

		assertEquals(24, firewall.getSeverity());
	}

}
