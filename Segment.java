package ficheTD3;



public class Segment {

	public Point A = new Point();
	public Point B = new Point();
  

	public Segment(Point A, Point B) {
		this.A.setAbcisse(A.getAbcisse());
		this.A.setOrdonnée(A.getOrdonnée());
		this.B.setAbcisse(A.getAbcisse());
		this.B.setOrdonnée(A.getOrdonnée());
		
		
		

	}
	
	
	public Segment(Point B) {

		this(new Point(),B);
	}


	public double distance(Point A, Point B) {

		return Math.sqrt(
				(Math.pow((B.getAbcisse() - A.getAbcisse()), 2) + Math.pow((B.getOrdonnée() - A.getOrdonnée()), 2)));
	}

	public String symétrie(Point A, Point B) {

		return A.symértie(A) + B.symértie(B);
	}

}
