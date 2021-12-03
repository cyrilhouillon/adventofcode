package daythree;

public class CarthesianCoordConverter {
	
	public Coord toCartesian(int index) {
		if (index == 1)
			return new Coord(0, 0);
		
		int squareSemiSize = getSquareSemiSize(index);
		
		int current = surfaceOf(squareSemiSize-1);
		Coord coord = new Coord(squareSemiSize-1, -(squareSemiSize-1));

		while(current != index) {
			current++;
			coord = coord.nextMove();
		}
		
		return  coord;
	}

	private int getSquareSemiSize(int index) {
		int semiSize = 0;
		
		while (surfaceOf(semiSize) < index) {
			semiSize++;
		}
		return semiSize;
	}

	private int surfaceOf(int semiSize) {
		return (semiSize*2+1)*(semiSize*2+1);
	}

}
