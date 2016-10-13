package ficheTD3;

public class Cercle {

	private float rayon;
	public Point centre = new Point();

	public Cercle(Point centre, float rayon) {

		this.centre.setAbcisse(centre.getAbcisse());
		this.centre.setOrdonnée(centre.getOrdonnée());
		this.rayon = rayon;

	}

	public Cercle(float rayon) {

		this(new Point(), rayon);
	}

	public float périmètre(float rayon) {

		return (float) (2 * rayon * Math.PI);
	}

	public String symétrie(Point centre) {

		return centre.symértie(centre);
	}

	public float getRayon() {
		return rayon;
	}

}
