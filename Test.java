package ficheTD3;

public class Test {

	public static void main(String[] args) {
		// exo 1
		System.out.println("- Crée 3 point dans l'espace on utilisant 3 constructeurs différents");

		Point A = new Point();
		Point B = new Point(5, 5);
		Point C = new Point(3, 8);

		System.out.println("Le point A mes coordonnées sont : A (" + A.getAbcisse() + "," + A.getOrdonnée() + ")");
		System.out.println("Le point B mes coordonnées sont : B (" + B.getAbcisse() + "," + B.getOrdonnée() + ")");
		System.out.println("Le point C mes coordonnées sont : C (" + C.getAbcisse() + "," + C.getOrdonnée() + ")");
		System.out.println("\n ");
		System.out.println("Donner les image de A,B,C");
		System.out.println("L'image de A est : A-1:" + A.symértie(A));
		System.out.println("L'image de B est : B-1:" + B.symértie(B));
		System.out.println("L'image de C est : A-1:" + C.symértie(C));
		// fin exo 1

		// exo2
		System.out.println("\n ");

		System.out.println("============================");
		System.out.println("Crée deux segment dans l'espace ");
		Segment AB = new Segment(A, B);
		Segment BC = new Segment(B, C);

		System.out.println("Le segment AB =" + AB.distance(A, B));
		System.out.println("Le segment BC =" + BC.distance(B, C));
		System.out.println("Crée l'image de segment  BC par rapport à l'axe des ordonnées");
		System.out.println("L'image de BC est CB" + BC.symétrie(B, C));
		// fin exo 2

		// exo 3
		System.out.println("\n ");

		System.out.println("============================");
		System.out.println("Crée deux cercles différents dans l'espace ");
		Cercle c1 = new Cercle(4);
		Cercle c2 = new Cercle(B, 3);
		System.out.println("Le Cercle c1  : centre  O (" + c1.centre.getAbcisse() + "," + c1.centre.getOrdonnée() + ") "
				+ " et Rayon r=" + c1.getRayon() + "périmètre=" + c1.périmètre(c1.getRayon()) + " son image  c1 "
				+ c1.centre.symértie(c1.centre) + " et Rayon r=" + c1.getRayon());
		System.out.println("Le Cercle c2  : centre  B (" + c2.centre.getAbcisse() + "," + c2.centre.getOrdonnée() + ") "
				+ " et Rayon r=" + c2.getRayon() + "périmètre=" + c2.périmètre(c2.getRayon()) + " son image  c2 "
				+ c2.centre.symértie(c2.centre) + " et Rayon r=" + c2.getRayon());
	}

}
