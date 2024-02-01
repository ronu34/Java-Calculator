import javax.swing.JOptionPane;
public class Isocelestri {
	double semiperimeter;
	double perimeter;
	double area;
	double base;
	double height;
	double sideA;
	double sideB;
	double sideC;
	
	void area() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a lenght of first side"));
		sideB = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a lenght of last two sides"));
		sideC = sideB;
		
		semiperimeter = (sideA+sideB+sideC)/2;
		
		area = Math.sqrt(semiperimeter*(semiperimeter-sideA)*(semiperimeter-sideB)*(semiperimeter-sideC));
		JOptionPane.showMessageDialog(null, "Area is:"+area+Main.unit+".sq");
	}
	void perimeter() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a lenght of first side"));
		sideB = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a lenght of last two sides"));
		sideC = sideB;
		
		perimeter = sideA + sideB + sideC;
		
		JOptionPane.showMessageDialog(null, "Main is:"+perimeter+Main.unit);
	}
}
