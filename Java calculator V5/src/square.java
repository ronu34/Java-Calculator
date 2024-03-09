
import javax.swing.JOptionPane;

public class square {
    double side;
    double area;
    double perimeter;

    void area() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        side = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the side length: "));
        area = side * side;
        JOptionPane.showMessageDialog(null, "The area is " + area + " " + Main.unit);
    }

    void perimeter() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        side = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the side length: "));
        perimeter = 4 * side;
        JOptionPane.showMessageDialog(null, "The perimeter is " + perimeter + " " + Main.unit);
    }
}

