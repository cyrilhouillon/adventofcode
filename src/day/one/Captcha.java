package day.one;

public class Captcha {
	
	private NextItemFinder nextItemFinder;
	
	public Captcha(NextItemFinder nextItemFinder) {
		this.nextItemFinder = nextItemFinder;
	}

	public Integer captcha(String input) {
		
		char[] array = input.toCharArray();
		
		Integer sum = 0;
	
		for (int i = 0; i < array.length; i++) {
			char current = array[i];
			char next = nextItemFinder.getNextItem(array, i);
			
			if(current == next){
				sum+=Integer.valueOf(""+current);
			}
		}
		return sum;
	}

}
