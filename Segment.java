package ficheTD3;



public class Segment {

	public Point A = new Point();
	public Point B = new Point();
  

	public Segment(Point A, Point B) {
		this.A.setAbcisse(A.getAbcisse());
		this.A.setOrdonn�e(A.getOrdonn�e());
		this.B.setAbcisse(A.getAbcisse());
		this.B.setOrdonn�e(A.getOrdonn�e());
		
		
		

	}
	
	
	public Segment(Point B) {

		this(new Point(),B);
	}


	public double distance(Point A, Point B) {

		return Math.sqrt(
				(Math.pow((B.getAbcisse() - A.getAbcisse()), 2) + Math.pow((B.getOrdonn�e() - A.getOrdonn�e()), 2)));
	}

	public String sym�trie(Point A, Point B) {

		return A.sym�rtie(A) + B.sym�rtie(B);
	}

}
