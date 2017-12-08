package daythree;

import java.util.Arrays;
import java.util.List;

public class Coord {
	
	public final int x;
	public final int y;

	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Coord nextMove() {
		int squareSemiSize = squareSemiSize();
		if(x == squareSemiSize && y != squareSemiSize && y != -squareSemiSize) {
			return up();
		}
		if(y == squareSemiSize && x != -squareSemiSize) {
			return left();
		}
		if(x == -squareSemiSize && y != -squareSemiSize) {
			return down();
		}
		if(y == -squareSemiSize) {
			return right();
		}
		throw new RuntimeException();
	}

	private Coord up() {
		return new Coord(x, y+1);
	}

	private Coord down() {
		return new Coord(x, y-1);
	}

	private Coord left() {
		return new Coord(x-1, y);
	}

	private Coord right() {
		return new Coord(x+1, y);
	}

	private int squareSemiSize() {
		return Math.max(Math.abs(x), Math.abs(y));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coord other = (Coord) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public List<Coord> neighbours() {
		return Arrays.asList(up().left(), up(), up().right(), right(), right().down(), down(), down().left(), left());
	}

}
