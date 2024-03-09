import javax.swing.JOptionPane;
public class Main {
	static String unit;

	public static void main(String[] args) {
		
		math math = new math();
		JOptionPane.showMessageDialog(null, "Welcome to Java Calculator V5");
		String Operation  = JOptionPane.showInputDialog(null,"What math operation ?");
		switch(Operation) {
		case "add" :
			math.add();
			break;
		case "sub":
			math.sub();
			break;
		case "multiply":
			math.multiply();
			break;
		case "div":
			math.divide();
			break;
		case "circle":
			circle circle = new circle();
			String Option = JOptionPane.showInputDialog(null, "What to find of circle?");
			switch(Option) {
				case "area":
					circle.area();
					break;
				case "circumference":
					circle.circumference();
					break;
				case "diameter":
					circle.diameter();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Option for Circle");
					break;
			}
			break;
		case "square":
			square square = new square();
			String squareOption = JOptionPane.showInputDialog(null, "What to find of square?");
			switch(squareOption) {
				case "area":
					square.area();
					break;
				case "perimeter":
					square.perimeter();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Option for Square");
					break;
			}
			break;
		case "right triangle":
			rightTriangle rightTriangle = new rightTriangle();
			String triangleOption = JOptionPane.showInputDialog(null, "What to find of right triangle?");
			switch(triangleOption) {
				case "area":
					rightTriangle.area();
					break;
				case "perimeter":
					rightTriangle.perimeter();
					break;
				case "hypotenuse":
					rightTriangle.hypotenuse();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Option for Right Triangle");
					break;
			}
			break;
		case "triangle":
			triangle triangle = new triangle();
			String RighttriangleOption = JOptionPane.showInputDialog(null, "What to find of triangle?");
			switch(RighttriangleOption) {
				case "area":
					triangle.area();
					break;
				case "perimeter":
					triangle.perimeter();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Option for Triangle");
					break;
			}
			break;
		case "rectangle":
			rectangle rectangle = new rectangle();
			String rectangleOption = JOptionPane.showInputDialog(null, "What to find of rectangle?");
			switch(rectangleOption) {
				case "area":
					rectangle.area();
					break;
				case "perimeter":
					rectangle.perimeter();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Option for Rectangle");
					break;
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Operation");
			break;
		}
		
	}

}
