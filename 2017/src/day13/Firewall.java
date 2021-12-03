package day13;

import java.util.List;

public class Firewall {

	private final List<Layer> layers;
	private int packetPosition = -1;
	private int severity = 0;

	public Firewall(List<Layer> layers) {
		this.layers = layers;
	}
	
	public void delay(int picoseconds){
		for (int i = 0; i < picoseconds; i++) {
			moveLayers();
		}
	}
	
	public Layer get(int i){
		return layers.get(i);
	}

	public List<Layer> allLayers() {
		return layers;
	}

	public void move() {
		movePacket();
		if(getCaught()){
			severity += layers.get(packetPosition).getSize() * packetPosition;
		}
		moveLayers();
	}

	private void moveLayers() {
		layers.forEach(l -> l.move());
	}

	private boolean getCaught() {
		return layers.get(packetPosition).getPosition() == 1;
	}

	private void movePacket() {
		packetPosition++;
	}

	public int getSeverity() {
		return severity;
	}

	public void moveToEnd() {
		while(packetPosition < layers.size()-1){
			move();
		}
	}
	
}
