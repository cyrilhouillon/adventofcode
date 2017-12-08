package day.six;

import java.util.Arrays;

public class MemoryBanks {

	private int[] banks;

	public MemoryBanks(int[] banks) {
		this.banks = banks;
	}

	public void reallocate() {
		int index = findIndexBiggestBank();
		int blocks = banks[index];
		banks[index] = 0;
		index++;
		while (blocks > 0) {
			banks[index % banks.length] = banks[index % banks.length] + 1;
			blocks--;
			index++;
		}
	}

	private int findIndexBiggestBank() {
		int index = 0;
		for (int i =0; i < banks.length; i++) {
			if(banks[i] > banks[index]){
				index = i;
			}
		}
		return index;
	}

	@Override
	public String toString() {
		return  Arrays.toString(banks);
	}
	
}
