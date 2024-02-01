import javax.swing.JOptionPane;
public class rhombus {
	void area() {
		double heightofrhombusarea = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Height:"));
		double baseofrhombusarea = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Base:"));
		double areaofrhombus = baseofrhombusarea * heightofrhombusarea;
		JOptionPane.showMessageDialog(null, "Area of rhombus : "+areaofrhombus+" "+Main.unit );
	}
	
	void perimeter() {
		double side = Double.parseDouble(JOptionPane.showInputDialog(null,"Length of a side: "));
		double peimeterofrhombus = side*4;
		JOptionPane.showMessageDialog(null, "Perimeter is "+peimeterofrhombus+" "+Main.unit );
	}
	void invalid() {
		JOptionPane.showMessageDialog(null, "Wrong option");
	}
}
