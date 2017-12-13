package day13;

public class Layer {

	private final int size;
	private int index;
	private int sens;

	public Layer(int size) {
		this.size = size;
		this.index = 1;
		this.sens = 1;
	}

	public int getPosition() {
		return index;
	}

	public void move() {
		index+=sens;
		if(index == 1 || index == size){
			sens = -sens;
		}
	}
	
	public static Layer emptyLayer = new Layer(0);
	static{
		emptyLayer.sens = 0;
		emptyLayer.index = 0;
	}
	public int getSize() {
		return size;
	}

}
