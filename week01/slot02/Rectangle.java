package week01.slot02;

public class Rectangle {

	// Instance variable
	int width;
	int height;
	// Class variable
	static String colour;
	
	public int calculateArea() {
		// Local variable
		int area;
		area = width * height;
		return area;
	}
	
	public int calculatePerimeter() {
		return (2 * width) + (2 * height);
	}
	
	public String showArea() {
		return "Area of Rectangle:"
				+ "\nwidth * height = " + width + " * " + height
				+ " = " + calculateArea() + "\ncolour = " + colour;
	}
	
	public String showPerimeter() {
		return "Perimeter of Rectangle:"
				+ "\n(2 * width) + (2 * height) = "
				+ "(2 * " + width + ") + (2 * " + height + ")"
				+ " = " + calculatePerimeter() + "\ncolour = " + colour;
				
	}
}
