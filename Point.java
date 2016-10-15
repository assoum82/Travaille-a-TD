package ficheTD3;

public class Point {
	private float abcisse;
	private float ordonnée;

	public Point() {
		this.abcisse = 0;
		this.ordonnée = 0;
	}

	Point(float abcisse) {
		this.abcisse = abcisse;
		this.ordonnée = abcisse;
	}

	Point(float abcisse, float ordonnée) {
		this.abcisse = abcisse;
		this.ordonnée = ordonnée;
	}

	public float getAbcisse() {
		return abcisse;
	}

	public float getOrdonnée() {
		return ordonnée;
	}

	public String symértie(Point p) {

		if (p.abcisse != 0)
			p.abcisse = -abcisse;
		return "(" + p.abcisse + "," + p.ordonnée + ")";

	}

	public void setAbcisse(float abcisse) {
		this.abcisse = abcisse;
	}

	public void setOrdonnée(float ordonnée) {
		this.ordonnée = ordonnée;
	}
}
//un autre dépot
