import javax.swing.JOptionPane;
public class circle {
	double radius;
	double circumference;
	double diameter;
	double area;
	double pi;
	
	void area() {
		Main.unit = JOptionPane.showInputDialog(null,"enter the unit: ");
		pi = Math.PI;
		radius = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the radius: "));
		area = radius * radius * pi;
		JOptionPane.showMessageDialog(null, "The area is "+area+" "+Main.unit);
	}

	void circumference() {
		Main.unit = JOptionPane.showInputDialog(null,"enter the unit: ");
		pi = Math.PI;
		radius = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the radius: "));
		circumference = 2 * pi * radius;
		JOptionPane.showMessageDialog(null, "The circumference is "+circumference+" "+Main.unit);
	}

	void diameter() {
		Main.unit = JOptionPane.showInputDialog(null,"enter the unit: ");
		pi = Math.PI;
		radius = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the radius: "));
		diameter = 2 * radius;
		JOptionPane.showMessageDialog(null, "The diameter is "+diameter+" "+Main.unit);
	}
}
