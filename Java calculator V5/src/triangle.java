import javax.swing.JOptionPane;

public class triangle {
    double side1;
    double side2;
    double side3;
    double area;
    double perimeter;

    void area() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the first side: "));
        side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the second side: "));
        side3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the third side: "));
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        JOptionPane.showMessageDialog(null, "The area is " + area + " " + Main.unit);
    }

    void perimeter() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the first side: "));
        side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the second side: "));
        side3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the third side: "));
        perimeter = side1 + side2 + side3;
        JOptionPane.showMessageDialog(null, "The perimeter is " + perimeter + " " + Main.unit);
    }
}
