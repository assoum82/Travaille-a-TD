package ficheTD3;

public class Test {

	public static void main(String[] args) {
		// exo 1
		System.out.println("- Cr�e 3 point dans l'espace on utilisant 3 constructeurs diff�rents");

		Point A = new Point();
		Point B = new Point(5, 5);
		Point C = new Point(3, 8);

		System.out.println("Le point A mes coordonn�es sont : A (" + A.getAbcisse() + "," + A.getOrdonn�e() + ")");
		System.out.println("Le point B mes coordonn�es sont : B (" + B.getAbcisse() + "," + B.getOrdonn�e() + ")");
		System.out.println("Le point C mes coordonn�es sont : C (" + C.getAbcisse() + "," + C.getOrdonn�e() + ")");
		System.out.println("\n ");
		System.out.println("Donner les image de A,B,C");
		System.out.println("L'image de A est : A-1:" + A.sym�rtie(A));
		System.out.println("L'image de B est : B-1:" + B.sym�rtie(B));
		System.out.println("L'image de C est : A-1:" + C.sym�rtie(C));
		// fin exo 1

		// exo2
		System.out.println("\n ");

		System.out.println("============================");
		System.out.println("Cr�e deux segment dans l'espace ");
		Segment AB = new Segment(A, B);
		Segment BC = new Segment(B, C);

		System.out.println("Le segment AB =" + AB.distance(A, B));
		System.out.println("Le segment BC =" + BC.distance(B, C));
		System.out.println("Cr�e l'image de segment  BC par rapport � l'axe des ordonn�es");
		System.out.println("L'image de BC est CB" + BC.sym�trie(B, C));
		// fin exo 2

		// exo 3
		System.out.println("\n ");

		System.out.println("============================");
		System.out.println("Cr�e deux cercles diff�rents dans l'espace ");
		Cercle c1 = new Cercle(4);
		Cercle c2 = new Cercle(B, 3);
		System.out.println("Le Cercle c1  : centre  O (" + c1.centre.getAbcisse() + "," + c1.centre.getOrdonn�e() + ") "
				+ " et Rayon r=" + c1.getRayon() + "p�rim�tre=" + c1.p�rim�tre(c1.getRayon()) + " son image  c1 "
				+ c1.centre.sym�rtie(c1.centre) + " et Rayon r=" + c1.getRayon());
		System.out.println("Le Cercle c2  : centre  B (" + c2.centre.getAbcisse() + "," + c2.centre.getOrdonn�e() + ") "
				+ " et Rayon r=" + c2.getRayon() + "p�rim�tre=" + c2.p�rim�tre(c2.getRayon()) + " son image  c2 "
				+ c2.centre.sym�rtie(c2.centre) + " et Rayon r=" + c2.getRayon());
	}

}
