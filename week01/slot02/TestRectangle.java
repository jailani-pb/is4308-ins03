package week01.slot02;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle.colour = "BLUE";
		Rectangle rectangle1 = new Rectangle();
		rectangle1.width = 5;
		rectangle1.height = 10;
		System.out.println(rectangle1.showArea());
		System.out.println(rectangle1.showPerimeter());
		// Create two (2) more instance of Rectangle class
		// named it rectangle2 and rectangle3.
		// For rectangle2, width = 5, height = 6
		// For rectangle3, width = 9, height = 15, colour = "RED"
		Rectangle rectangle2 = new Rectangle();
		rectangle2.width = 5;
		rectangle2.height = 6;
		Rectangle rectangle3 = new Rectangle();
		rectangle3.width = 9;
		rectangle3.height = 15;
//		rectangle3.colour = "RED";
		
		System.out.println(rectangle1.showArea());
		System.out.println(rectangle2.showArea());
		System.out.println(rectangle3.showArea());
	}
	
}
