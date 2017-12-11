package day.ten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashingStepExecutorTest {
	
	HashingStepExecutor hash = new HashingStepExecutor(new ListProvider(5).getNew(), new SubListReverser());

	@Test
	void test() {
		hash.reverse(3);
		assertArrayEquals(new int[]{2,1,0,3,4}, hash.getHashList());
		
		hash.reverse(4);
		assertArrayEquals(new int[]{4,3,0,1,2}, hash.getHashList());
		
		hash.reverse(1);
		assertArrayEquals(new int[]{4,3,0,1,2}, hash.getHashList());
		
		hash.reverse(5);
		assertArrayEquals(new int[]{3,4,2,1,0}, hash.getHashList());
		
	}

}
