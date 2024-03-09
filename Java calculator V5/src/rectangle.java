import javax.swing.JOptionPane;

public class rectangle {
    double length;
    double width;
    double area;
    double perimeter;

    void area() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length: "));
        width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the width: "));
        area = length * width;
        JOptionPane.showMessageDialog(null, "The area is " + area + " " + Main.unit);
    }

    void perimeter() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length: "));
        width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the width: "));
        perimeter = 2 * (length + width);
        JOptionPane.showMessageDialog(null, "The perimeter is " + perimeter + " " + Main.unit);
    }
}

