package ficheTD3;

public class Point {
	private float abcisse;
	private float ordonn�e;

	public Point() {
		this.abcisse = 0;
		this.ordonn�e = 0;
	}

	Point(float abcisse) {
		this.abcisse = abcisse;
		this.ordonn�e = abcisse;
	}

	Point(float abcisse, float ordonn�e) {
		this.abcisse = abcisse;
		this.ordonn�e = ordonn�e;
	}

	public float getAbcisse() {
		return abcisse;
	}

	public float getOrdonn�e() {
		return ordonn�e;
	}

	public String sym�rtie(Point p) {

		if (p.abcisse != 0)
			p.abcisse = -abcisse;
		return "(" + p.abcisse + "," + p.ordonn�e + ")";

	}

	public void setAbcisse(float abcisse) {
		this.abcisse = abcisse;
	}

	public void setOrdonn�e(float ordonn�e) {
		this.ordonn�e = ordonn�e;
	}
}
