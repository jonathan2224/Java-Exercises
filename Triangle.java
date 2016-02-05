public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double x, double y, double z) throws TriangleException {
		if(testTriange(x, y, z)) throw new TriangleException();
		
		side1 = x;
		side2 = y;
		side3 = z;
	}
	
	public TriangleKind getKind() {
		if(side1 == side2 && side1==side3 && side2==side3) {
			return TriangleKind.EQUILATERAL;
		} else if (side1 == side2 || side1==side3 || side2==side3) {
			return TriangleKind.ISOSCELES;
		} else {
			return TriangleKind.SCALENE;
		}
	}
	
	private boolean testTriange(double x, double y, double z) {
		return inequality(x, y, z) || inequality(x, z, y) || inequality(z,y,x);
	}
	
	private boolean inequality(double x, double y, double z) {
		return !(x+y>z);
	}
}
