import javax.swing.JOptionPane;

public class rightTriangle {
    double base;
    double height;
    double hypotenuse;
    double area;
    double perimeter;

    void area() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base length: "));
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the height length: "));
        area = (base * height) / 2;
        JOptionPane.showMessageDialog(null, "The area is " + area + " " + Main.unit);
    }

    void perimeter() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base length: "));
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the height length: "));
        hypotenuse = Math.sqrt((base * base) + (height * height));
        perimeter = base + height + hypotenuse;
        JOptionPane.showMessageDialog(null, "The perimeter is " + perimeter + " " + Main.unit);
    }

    void hypotenuse() {
        Main.unit = JOptionPane.showInputDialog(null, "Enter the unit: ");
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base length: "));
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the height length: "));
        hypotenuse = Math.sqrt((base * base) + (height * height));
        JOptionPane.showMessageDialog(null, "The hypotenuse is " + hypotenuse + " " + Main.unit);
    }
}

