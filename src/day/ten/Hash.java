package day.ten;

public class Hash {

	private ListProvider listProvider;

	public Hash(ListProvider listProvider) {
		this.listProvider = listProvider;
	}

	public int hashOf(int[] listToHash) {
		HashingStepExecutor executor = new HashingStepExecutor(listProvider.getNew(), new SubListReverser());
		
		for (int i : listToHash) {
			executor.reverse(i);
		}
		
		return executor.getHashList()[0] * executor.getHashList()[1];
	}

}
