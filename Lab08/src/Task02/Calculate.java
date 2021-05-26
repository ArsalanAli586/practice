package Task02;
public final class Calculate {
	private double r=49.0;
	final double p=3.14;
	public double getCircumference() {
	return 2*p*r;}
	public double getArea() {
	return p*(r*r);}
	public double getVolume() {
	return 4/3*p*(r*r*r);}
	public double getSurface() {
	return 4*p*(r*r);}
	public static void main(String[] args) {
		Calculate obj = new Calculate();
		System.out.println("Circumference is: " +
		obj.getCircumference());
		System.out.println("\nArea is: " + obj.getArea());
		System.out.println("\nVolume is: " + obj.getVolume());
		System.out.println("\nSurface is: " + obj.getSurface());
	}
}


