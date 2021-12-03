package day.five;

import java.util.function.IntUnaryOperator;

public class Listing {

	public int[] state;
	public int index;
	private IntUnaryOperator valueComputation;

	public Listing(int[] state, int index, IntUnaryOperator valueComputation) {
		this.state = state;
		this.index = index;
		this.valueComputation = valueComputation;
	}

	public void move() {
		int futurIndex = index + state[index];
		state[index] = valueComputation.applyAsInt(state[index]);
		index=futurIndex;
		
		if(index < 0 || index>state.length-1){
			index = -1;
		}
	}

}
