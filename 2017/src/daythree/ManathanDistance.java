package daythree;

public class ManathanDistance {

	private CarthesianCoordConverter converter;

	public ManathanDistance(CarthesianCoordConverter converter) {
		this.converter = converter;
	}

	public int fromCenter(int index) {
		Coord coord1 = converter.toCartesian(1);
		Coord coordCible = converter.toCartesian(index);
		int distance = Math.abs(coord1.x - coordCible.x) + Math.abs(coord1.y - coordCible.y);
		return distance;
	}

}
