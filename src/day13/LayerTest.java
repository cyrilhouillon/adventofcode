package day13;

import static org.junit.Assert.*;

import org.junit.Test;

public class LayerTest {

	@Test
	public void layer_should_start_at_position_one() {
		Layer layer = new Layer(3);
		
		assertEquals(1, layer.getPosition());
	}

	@Test
	public void layer_can_move() {
		Layer layer = new Layer(3);
		
		layer.move();
		
		assertEquals(2, layer.getPosition());
	}

	@Test
	public void layer_go_backward_when_reaches_bottom() {
		Layer layer = new Layer(3);
		
		layer.move();
		layer.move();
		layer.move();
		
		assertEquals(2, layer.getPosition());
	}

}
