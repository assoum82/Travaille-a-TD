package ficheTD3;

public class Cercle {

	private float rayon;
	public Point centre = new Point();

	public Cercle(Point centre, float rayon) {

		this.centre.setAbcisse(centre.getAbcisse());
		this.centre.setOrdonn�e(centre.getOrdonn�e());
		this.rayon = rayon;

	}

	public Cercle(float rayon) {

		this(new Point(), rayon);
	}

	public float p�rim�tre(float rayon) {

		return (float) (2 * rayon * Math.PI);
	}

	public String sym�trie(Point centre) {

		return centre.sym�rtie(centre);
	}

	public float getRayon() {
		return rayon;
	}

}
