package day.ten;

import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KnotHash {

	private byte[] suffix = new byte[] { 17, 31, 73, 47, 23 };

	private ListProvider listProvider = new ListProvider(256);

	public String hashOf(String input) {
		byte[] bytes = getBytesList(input);
		int[] sparseHash = getSparseHash(bytes);
		int[] denseHash = getDenseHash(sparseHash);
		String hash = hexaRepresentation(denseHash);
		return hash;
	}

	private String hexaRepresentation(int[] denseHash) {
		return IntStream.of(denseHash)//
			.mapToObj(i -> String.format("%2s", Integer.toHexString(i)).replace(' ', '0'))//
			.collect(Collectors.joining());
	}

	private int[] getDenseHash(int[] sparseHash) {
		int[] denseHash = new int[16];
		for (int i = 0; i < 16; i++) {
			int val = 0;
			for (int j = 0; j < 16; j++) {
				val = val ^ sparseHash[16*i+j];
			}
			denseHash[i] = val;
		}
		return denseHash;
	}

	private byte[] getBytesList(String input) {
		try {
			byte[] bytes = input.getBytes("US-ASCII");
			byte[] toHash = new byte[bytes.length + suffix.length];
			System.arraycopy(bytes, 0, toHash, 0, bytes.length);
			System.arraycopy(suffix, 0, toHash, bytes.length, suffix.length);
			return toHash;
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException();
		}
	}

	private int[] getSparseHash(byte[] listToHash) {
		HashingStepExecutor executor = new HashingStepExecutor(listProvider.getNew(), new SubListReverser());

		for (int round = 0; round < 64; round++) {
			for (byte i : listToHash) {
				executor.reverse(i);
			}
		}

		return executor.getHashList();
	}

}
